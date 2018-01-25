package c4q.com.midunitpractical5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by D on 1/24/18.
 */

public abstract class UserModel {

    public class Name
    {
        private String title;

        public String getTitle() { return this.title; }

        public void setTitle(String title) { this.title = title; }

        private String first;

        public String getFirst() { return this.first; }

        public void setFirst(String first) { this.first = first; }

        private String last;

        public String getLast() { return this.last; }

        public void setLast(String last) { this.last = last; }
    }

    public class Location
    {
        private String street;

        public String getStreet() { return this.street; }

        public void setStreet(String street) { this.street = street; }

        private String city;

        public String getCity() { return this.city; }

        public void setCity(String city) { this.city = city; }

        private String state;

        public String getState() { return this.state; }

        public void setState(String state) { this.state = state; }

        private int postcode;

        public int getPostcode() { return this.postcode; }

        public void setPostcode(int postcode) { this.postcode = postcode; }
    }

    public class Picture
    {
        private String large;

        public String getLarge() { return this.large; }

        public void setLarge(String large) { this.large = large; }

        private String medium;

        public String getMedium() { return this.medium; }

        public void setMedium(String medium) { this.medium = medium; }

        private String thumbnail;

        public String getThumbnail() { return this.thumbnail; }

        public void setThumbnail(String thumbnail) { this.thumbnail = thumbnail; }
    }

    public class Result
    {
        private Name name;

        public Name getName() { return this.name; }

        public void setName(Name name) { this.name = name; }

        private Location location;

        public Location getLocation() { return this.location; }

        public void setLocation(Location location) { this.location = location; }

        private String email;

        public String getEmail() { return this.email; }

        public void setEmail(String email) { this.email = email; }

        private String dob;

        public String getDob() { return this.dob; }

        public void setDob(String dob) { this.dob = dob; }

        private String cell;

        public String getCell() { return this.cell; }

        public void setCell(String cell) { this.cell = cell; }

        private Picture picture;

        public Picture getPicture() { return this.picture; }

        public void setPicture(Picture picture) { this.picture = picture; }
    }

    public class Info
    {
        private String seed;

        public String getSeed() { return this.seed; }

        public void setSeed(String seed) { this.seed = seed; }

        private int results;

        public int getResults() { return this.results; }

        public void setResults(int results) { this.results = results; }

        private int page;

        public int getPage() { return this.page; }

        public void setPage(int page) { this.page = page; }

        private String version;

        public String getVersion() { return this.version; }

        public void setVersion(String version) { this.version = version; }
    }

    public class RootObject
    {
        private ArrayList<Result> results;

        public ArrayList<Result> getResults() { return this.results; }

        public void setResults(ArrayList<Result> results) { this.results = results; }

        private Info info;

        public Info getInfo() { return this.info; }

        public void setInfo(Info info) { this.info = info; }
    }

}
