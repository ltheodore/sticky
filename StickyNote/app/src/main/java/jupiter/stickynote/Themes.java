package jupiter.stickynote;

import java.util.ArrayList;

/**
 * Created by Antho on 13/02/2017.
 */

public class Themes {

    private ArrayList<Theme> themeList = new ArrayList<>();

    /**
     * Add a theme to the list
     * @param t
     */
    public void AddTheme(Theme t)
    {
        this.themeList.add(t);
    }

    /**
     * Delete a theme from the list
     * @param t
     */
    public void DeleteTheme(Theme t)
    {
        this.themeList.remove(t);
    }

    /**
     * Clear the list
     */
    public void DeleteAllTheme()
    {
        this.themeList.clear();
    }


    // !! ajouter une fonction pour lister le contenu

}
