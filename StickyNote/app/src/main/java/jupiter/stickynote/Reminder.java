package jupiter.stickynote;

import java.util.Date;

/**
 * Created by Antho on 13/02/2017.
 */

public class Reminder {

    private Date date; // !! modifier suivant le composant graphique
    private Date hour; // !! modifier suivant le composant graphique

    /**
     * Constructor
     * @param date, hour
     */
    public Reminder(Date date, Date hour) {
        this.date = date;
        this.hour = hour;
    }

    public Reminder() {

    }

    /**
     * Send a notification with the date and the hour to the user
     */
    public void SendNotification() {
        //Add android notification
    }

    /**
     * Getter
     * @return the date of the note
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter
     * @param date
     * set the date of the note
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Getter
     * @return the hour of the note
     */
    public Date getHour() {
        return hour;
    }

    /**
     * Setter
     * @param hour
     * set the hour of the note
     */
    public void setHour(Date hour) {
        this.hour = hour;
    }

}
