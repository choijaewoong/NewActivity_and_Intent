package com.torerov.applicatrioncomponent;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Tacademy on 2015-10-07.
 */
public class Person2 implements Parcelable {
    String name;
    int age;
    String message;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeString(message);
    }

    public static Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>(){

        @Override
        public Person createFromParcel(Parcel source) {
            Person p = new Person();
            return null;
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[0];
        }
    };
}
