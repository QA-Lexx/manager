public class AddFilm {
    private int id;
    private String filmTitle;
    private int releaseYear;

    public AddFilm(int id, String filmTitle, int releaseYear) {
        this.id = id;
        this.filmTitle = filmTitle;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
