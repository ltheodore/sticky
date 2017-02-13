package jupiter.stickynote;

import java.util.ArrayList;

/**
 * Created by Antho on 13/02/2017.
 */

public class Theme {

    private String name;

    private ArrayList<Note> noteList = new ArrayList<>();

    // !! Ajouter l'image pour un theme

    /**
     * Constructor
     * @param name
     */
    public Theme(String name)
    {
        this.name = name;
    }

    /**
     * Second constructor
     */
    public Theme()
    {

    }

    /**
     * Getter
     * @return the name of the theme
     */
    public String getName() {
        return name;
    }

    /**
     * Setter
     * Set the value of a theme
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Display a theme
     * @return
     */
    public String toString()
    {
        return this.name;
    }

    /**
     * Add a note to the theme list
     * @param n
     */
    public void AddNote(Note n)
    {
        this.noteList.add(n);
    }

    /**
     * Delete a note from the theme list
     * @param n
     */
    public void DeleteNote(Note n)
    {
        this.noteList.remove(n);
    }

    /**
     * Get the note list of the theme
     * @return
     */
    public ArrayList<Note> getNoteArray()
    {
        return this.noteList;
    }
}
