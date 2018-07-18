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

//Cria uma nova importação CSV extendendo a classe Importer do Jabref
public class CSVImporter extends Importer {

    private final ImportFormatPreferences importFormatPreferences;
    private final FileUpdateMonitor fileMonitor;

    public CSVImporter(ImportFormatPreferences importFormatPreferences, FileUpdateMonitor fileMonitor) {
        this.importFormatPreferences = importFormatPreferences;
        this.fileMonitor = fileMonitor;
    }

    //Define os nomes, tipos, id e descrição para a importação do CSV.
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

    //Função para sobrescrever o Parser para a leitura do CSV. Lê do arquivo e realiza a importação para o jabref.
    @Override
    public ParserResult importDatabase(BufferedReader reader) throws IOException {
        Objects.requireNonNull(reader);

        StringTokenizer st;
        String line, teste;
        List<BibEntry> entries = new LinkedList<>();

        //Variável teste para verificação de tipo de dado.
		teste = reader.readLine();

		//Se o tipo for artigo, insere na estrutura para artigo
		if (teste.equals("article")) {
			while ((line = reader.readLine()) != null) {

				//Seleciona o tipo como artigo
				BibEntry bib = new BibEntry("article");

				//Especifica que a separação das informações é feita por virgula
				st = new StringTokenizer(line, ",");

                //Passa as informações para as estruturas do programa, separadas pelo token virgula
				bib.setField(FieldName.AUTHOR, st.nextToken());
				bib.setField(FieldName.TITLE, st.nextToken());
				bib.setField(FieldName.JOURNAL, st.nextToken());
				bib.setField(FieldName.YEAR, st.nextToken());

				//Adiciona a nova entrada com os dados obtidos anteriormente
				entries.add(bib);
			}

			//Se for do tipo livro, insere na estrutura para livro
		} else if (teste.equals("book")){
			while ((line = reader.readLine()) != null) {

                //Seleciona o tipo como livro
				BibEntry bib = new BibEntry("book");

                //Especifica que a separação das informações é feita por virgula
				st = new StringTokenizer(line, ",");

                //Passa as informações para as estruturas do programa, separadas pelo token virgula
				bib.setField(FieldName.AUTHOR, st.nextToken());
				bib.setField(FieldName.TITLE, st.nextToken());
				bib.setField(FieldName.YEAR, st.nextToken());
				bib.setField(FieldName.PUBLISHER, st.nextToken());
				bib.setField(FieldName.EDITOR, st.nextToken());

                //Adiciona a nova entrada com os dados obtidos anteriormente
				entries.add(bib);
			}
		} else {
            while ((line = reader.readLine()) != null) {

                //Seleciona o tipo como livro
                BibEntry bib = new BibEntry("manual");

                //Especifica que a separação das informações é feita por virgula
                st = new StringTokenizer(line, ",");

                //Passa as informações para as estruturas do programa, separadas pelo token virgula
                bib.setField(FieldName.TITLE, st.nextToken());
                bib.setField(FieldName.AUTHOR, st.nextToken());
                bib.setField(FieldName.YEAR, st.nextToken());

                //Adiciona a nova entrada com os dados obtidos anteriormente
                entries.add(bib);
            }
        }

	
        //Adiciona as informações na base de dados
        return new ParserResult(entries);
    }
}