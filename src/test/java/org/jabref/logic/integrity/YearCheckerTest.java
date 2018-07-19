package org.jabref.logic.bibtexkeypattern;

import java.util.Optional;

import org.jabref.logic.importer.ImportFormatPreferences;
import org.jabref.logic.importer.ParseException;
import org.jabref.logic.importer.fileformat.BibtexParser;
import org.jabref.logic.integrity.YearChecker;
import org.jabref.model.database.BibDatabase;
import org.jabref.model.entry.BibEntry;
import org.jabref.model.entry.FieldName;
import org.jabref.model.util.DummyFileUpdateMonitor;
import org.jabref.model.util.FileUpdateMonitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class YearCheckerTest {

    private static ImportFormatPreferences importFormatPreferences;
    private final FileUpdateMonitor fileMonitor = new DummyFileUpdateMonitor();

    @BeforeEach
    public void setUp() {
        importFormatPreferences = mock(ImportFormatPreferences.class, Answers.RETURNS_DEEP_STUBS);
    }

    @Test
    public void testInvalidYearLetra() throws ParseException {
        Optional<BibEntry> entry0 = BibtexParser.singleFromString(
                "@Article{label,\n" +
                        "  author = {Iuri Bonna},\n" +
                        "  title  = {Atividade do Grupo 4},\n" +
                        "  year   = {2 mil e 18},\n" +
                        "}", importFormatPreferences, fileMonitor);

        String year = BibtexKeyGenerator.getFieldValue(entry0.get(), FieldName.YEAR,',', new BibDatabase());
        YearChecker yearChecker = new YearChecker();
        assertEquals("Optional[invalid java calendar year]",
                yearChecker.checkValue(year).toString());
    }

    @Test
    public void testInvalidYearZero() throws ParseException {
        Optional<BibEntry> entry0 = BibtexParser.singleFromString(
                "@Article{label,\n" +
                        "  author = {Iuri Bonna},\n" +
                        "  title  = {Atividade do Grupo 4},\n" +
                        "  year   = {0},\n" +
                        "}", importFormatPreferences, fileMonitor);

        String year = BibtexKeyGenerator.getFieldValue(entry0.get(), FieldName.YEAR,',', new BibDatabase());
        YearChecker yearChecker = new YearChecker();
        assertEquals("Optional[invalid java calendar year]",
                yearChecker.checkValue(year).toString());
    }

    @Test
    public void testInvalidYearMax() throws ParseException {
        Optional<BibEntry> entry0 = BibtexParser.singleFromString(
                "@Article{label,\n" +
                        "  author = {Iuri Bonna},\n" +
                        "  title  = {Atividade do Grupo 4},\n" +
                        "  year   = {292278995},\n" +
                        "}", importFormatPreferences, fileMonitor);

        String year = BibtexKeyGenerator.getFieldValue(entry0.get(), FieldName.YEAR,',', new BibDatabase());
        YearChecker yearChecker = new YearChecker();
        assertEquals("Optional[invalid java calendar year]",
                yearChecker.checkValue(year).toString());
    }

    @Test
    public void testInvalidYearCorreto() throws ParseException {
        Optional<BibEntry> entry0 = BibtexParser.singleFromString(
                "@Article{label,\n" +
                        "  author = {Iuri Bonna},\n" +
                        "  title  = {Atividade do Grupo 4},\n" +
                        "  year   = {1991},\n" +
                        "}", importFormatPreferences, fileMonitor);

        String year = BibtexKeyGenerator.getFieldValue(entry0.get(), FieldName.YEAR,',', new BibDatabase());
        YearChecker yearChecker = new YearChecker();
        assertEquals(Optional.empty().toString(),
                yearChecker.checkValue(year).toString());
    }

    @Test
    public void testInvalidYearCaractere() throws ParseException {
        Optional<BibEntry> entry0 = BibtexParser.singleFromString(
                "@Article{label,\n" +
                        "  author = {Iuri Bonna},\n" +
                        "  title  = {Atividade do Grupo 4},\n" +
                        "  year   = {2017/2},\n" +
                        "}", importFormatPreferences, fileMonitor);

        String year = BibtexKeyGenerator.getFieldValue(entry0.get(), FieldName.YEAR,',', new BibDatabase());
        YearChecker yearChecker = new YearChecker();
        assertEquals("Optional[invalid java calendar year]",
                yearChecker.checkValue(year).toString());
    }
}
