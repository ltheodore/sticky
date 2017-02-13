package jupiter.stickynote;

/**
 * Created by Antho on 13/02/2017.
 */

public class Note {

    private String text;

    private String title;

    private Theme theme;

    /**
     * Constructor
     * @param text
     */
    public Note(String text, String title, Theme theme)
    {
        this.text = text;
        this.title = title;
        this.theme = theme;
    }

    /**
     * Seconc constructor
     */
    public Note()
    {

    }

    /**
     * Getter
     * @return the text of the note
     */
    public String getText() {
        return text;
    }

    /**
     * Setter
     * @param text
     * set the text of the note
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter
     * @return the title of the note
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter
     * @param title
     * set the title of the note
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Getter
     * @return the theme of the note
     */
    public Theme getTheme() {
        return theme;
    }

    /**
     * Setter
     * @param theme
     * set the theme of the note
     */
    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    /**
     * Display a note
     * @return
     */
    public String toString()
    {
        return this.theme + this.title + this.text;
    }

}
