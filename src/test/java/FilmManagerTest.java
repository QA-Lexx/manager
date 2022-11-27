import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    AddFilm film1 = new AddFilm(1, "Бладшот", 2022);
    AddFilm film2 = new AddFilm(2, "Вперед", 2022);
    AddFilm film3 = new AddFilm(3, "Отель Белград", 2022);
    AddFilm film4 = new AddFilm(4, "Джентльмены", 2022);
    AddFilm film5 = new AddFilm(5, "Человек-невидимка", 2022);
    AddFilm film6 = new AddFilm(6, "Тролли. Мировой тур", 2022);
    AddFilm film7 = new AddFilm(7, "Номер один", 2022);
    AddFilm film8 = new AddFilm(8, "Фильм 8", 2022);
    AddFilm film9 = new AddFilm(9, "Фильм 9", 2022);
    AddFilm film10 = new AddFilm(10, "Фильм 10", 2022);

    @Test
    public void addNewFilmTest() {
        FilmManager manager = new FilmManager();
        manager.save(film1);

        AddFilm[] expected = {film1};
        AddFilm[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedFilmsTest() {
        FilmManager manager = new FilmManager();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);

        AddFilm[] expected = {film1, film2, film3, film4, film5, film6, film7};
        AddFilm[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
}
