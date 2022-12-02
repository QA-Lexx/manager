import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void addAndShowFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");

        String[] expected = {"film1", "film2", "film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showFilmsReverseOrderLessLimit() {
        FilmManager manager = new FilmManager();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = manager.findLast(10);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showFilmsReverseOrderEqualLimit() {
        FilmManager manager = new FilmManager();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");

        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast(10);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showFilmsReverseOrderMoreLimit() {
        FilmManager manager = new FilmManager();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");

        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2"};
        String[] actual = manager.findLast(10);

        Assertions.assertArrayEquals(expected, actual);
    }

}
