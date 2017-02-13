package jupiter.stickynote;

/**
 * Created by Pev on 13/02/2017.
 */

public interface View {

    public void AddNote(Note n);

    public void ModifyNote(Note n);

    public void DeleteNote(Note n);

    public void AddTheme(Theme t);

    public void ModifyTheme(Theme t);

    public void DeleteTheme(Theme t);


}
