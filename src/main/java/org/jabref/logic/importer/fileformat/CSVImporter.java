package org.jabref.logic.importer.fileformat;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;
import org.jabref.logic.importer.ImportFormatPreferences;
import org.jabref.logic.importer.Importer;
import org.jabref.logic.importer.ParserResult;
import org.jabref.logic.util.FileType;
import org.jabref.model.entry.BibEntry;
import org.jabref.model.entry.FieldName;
import org.jabref.model.util.FileUpdateMonitor;

public class CSVImporter extends Importer {

    private final ImportFormatPreferences importFormatPreferences;
    private final FileUpdateMonitor fileMonitor;

    public CSVImporter(ImportFormatPreferences importFormatPreferences, FileUpdateMonitor fileMonitor) {
        this.importFormatPreferences = importFormatPreferences;
        this.fileMonitor = fileMonitor;
    }

    @Override
    public String getName() {
        return "CSV";
    }

    @Override
    public FileType getFileType() {
        return FileType.CSV;
    }


    @Override
    public String getId() {
        return "csv";
    }

    @Override
    public String getDescription() {
        return "This importer enable CSV importing\n";
    }

    @Override
    public boolean isRecognizedFormat(BufferedReader reader) {
        Objects.requireNonNull(reader);
        return true;
    }

    //Parser do CSV
    @Override
    public ParserResult importDatabase(BufferedReader reader) throws IOException {
        Objects.requireNonNull(reader);

        StringTokenizer st;
        String line;
        List<BibEntry> entries = new LinkedList<>();

        //Roda o loop enquanto ouver linhas para serem lidas no arquivo CSV.
        while ((line = reader.readLine()) != null) {

            //Seleciona como um Tipo artigo
            BibEntry bib = new BibEntry("article");

            //Faz a separação das colunas por virgula
            st = new StringTokenizer(line, ",");

            bib.setField(FieldName.AUTHOR, st.nextToken());
            bib.setField(FieldName.TITLE, st.nextToken());
			bib.setField(FieldName.JOURNAL, st.nextToken());
            bib.setField(FieldName.YEAR, st.nextToken());
            bib.setField(FieldName.KEYWORDS, st.nextToken());
            bib.setField(FieldName.ISSN, st.nextToken());
            bib.setField(FieldName.NOTE, st.nextToken());

            //add to the results
            entries.add(bib);
        }

        //add to database
        return new ParserResult(entries);

    }


}