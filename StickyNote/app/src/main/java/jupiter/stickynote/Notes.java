package jupiter.stickynote;

import java.util.ArrayList;

/**
 * Created by Antho on 13/02/2017.
 */

public class Notes {

    private ArrayList<Note> noteList = new ArrayList<>();

    private Theme theme;

    /**
     * Add a note to a list
     * @param n
     */
    public void AddNote(Note n)
    {
        this.noteList.add(n);
    }

    /**
     * Delete a note from the list
     * @param n
     */
    public void DeleteNote(Note n)
    {
        this.noteList.remove(n);
    }

    /**
     * Clear the list
     */
    public void DeleteAllNote()
    {
        this.noteList.clear();
    }

    /**
     * return all the notes from a specific theme
     * @return
     */
    public ArrayList<Note> GetNotesByTheme()
    {
        return null; //todo
    }

    // !! ajouter une fonction pour lister le contenu
}
