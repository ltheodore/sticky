package jupiter.stickynote;

import java.util.ArrayList;

/**
 * Created by Maison on 13/02/2017.
 */

public class Subject implements View {
    private ArrayList<View> viewList = new ArrayList<>();



    public Subject(){}

    public void Subscribe(View v){
        viewList.add(v);
    }

    public void Unsubscribe(View v){
        viewList.remove(v);
    }

    @Override
    public void AddNote(Note n) {
        for (View v : viewList) {
            v.AddNote(n);
        }
    }

    @Override
    public void ModifyNote(Note n) {
        for (View v : viewList) {
            v.ModifyNote(n);
        }
    }

    @Override
    public void DeleteNote(Note n) {
        for (View v : viewList) {
            v.DeleteNote(n);
        }
    }

    @Override
    public void AddTheme(Theme t) {
        for (View v : viewList) {
            v.AddTheme(t);
        }
    }

    @Override
    public void ModifyTheme(Theme t) {
        for (View v : viewList) {
            v.ModifyTheme(t);
        }
    }

    @Override
    public void DeleteTheme(Theme t) {
        for (View v : viewList) {
            v.DeleteTheme(t);
        }
    }
}
