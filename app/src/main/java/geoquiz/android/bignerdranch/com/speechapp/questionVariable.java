package geoquiz.android.bignerdranch.com.speechapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Landon on 4/12/2015.
 */
public class questionVariable implements Parcelable{

    String question;
    int pictureID;
    String soundName;

    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(question);
        dest.writeInt(pictureID);
        dest.writeString(soundName);

    }
    private void readFromParcel(Parcel in) {
        question = in.readString();
        pictureID = in.readInt();
        soundName = in.readString();
    }
    public questionVariable()
    {
        question = "";
        pictureID = 0;
        soundName = "";

    }

    public questionVariable(Parcel parcel) {
        this.question = parcel.readString();
        this.pictureID = parcel.readInt();
        this.soundName = parcel.readString();
    }

    public String getQuestion()
    {
        return question;
    }
    public String setQuestion(String userQuestion)
    {
        question = userQuestion;
        return question;
    }
    public int getPictureID()
    {
        return pictureID;
    }
    public int setPictureID(int newPictureID) {
        pictureID = newPictureID;
        return pictureID;
    }
    public String getSoundName()
    {
        return soundName;
    }
    public String setSoundName(String newSoundName) {
        soundName = newSoundName;
        return soundName;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public questionVariable createFromParcel(Parcel in) {
            return new questionVariable(in);
        }

        public questionVariable[] newArray(int size) {
            return new questionVariable[size];
        }
    };

    @Override
    public String toString()
    {
        return "Question: \n"+getQuestion()+"\nPicture Path:\n"+getPictureID();



    }


}
