
package com.mycompany.musicapp;


public class Song {
   String title;
   String artist;
   double duration;
   
   //Default constructor
   public Song()
   {
       this.title="unknown";
       this.artist="unknown";
       this.duration=0.0;
   }
   
   //Constructor with title
   public Song(String title)
   {
       this.title=title;
       this.artist="unknown";
       this.duration=0.0;
   }
     //Constructor with title and artist
   public Song(String title, String artist)
   {
       this.title=title;
       this.artist=artist;
       this.duration=0.0;
   }
     //Constructor with all details
   public Song(String title, String artist, double duration)
   {
       this.title=title;
       this.artist=artist;
       this.duration= duration;
   }
   public void DisplayInfo()
   {
  System.out.println("*********My Play List*********");
  System.out.println("Song Title: " + title);
  System.out.println("Song Artist: " + artist);
  System.out.println("Song Duration: " + duration + " minutes");
  System.out.println("*************************");
   
   }
   
}
