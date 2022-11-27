public class FilmManager {
    private AddFilm[] films = new AddFilm[0];

    private FilmManager manager;

    public void save(AddFilm film) {
        AddFilm[] tmp = new AddFilm[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public AddFilm[] getFilms() {
        return films;
    }
}
