package com.example.madpropertypal3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static String nme;

    //TABLE PROPERTIES
    public static final String PROPERTIES = "PROPERTIES";
    public static final String COLUMN_PROPERTY_NAME = "PROPERTY_NAME";
    public static final String COLUMN_PROPERTY_TYPE = "PROPERTY_TYPE";
    public static final String COLUMN_PROPERTY_LEASE_TYPE = "PROPERTY_LEASE_TYPE";
    public static final String COLUMN_PROPERTY_LOCATION = "PROPERTY_LOCATION";
    public static final String COLUMN_PROPERTY_SIZE = "PROPERTY_SIZE";
    public static final String COLUMN_PROPERTY_AMENITIES = "PROPERTY_AMENITIES";
    public static final String COLUMN_PROPERTY_DESCRIPTION = "PROPERTY_DESCRIPTION";
    public static final String COLUMN_PROPERTY_BEDROOMS = "PROPERTY_BEDROOMS";
    public static final String COLUMN_PROPERTY_BATHROOMS = "PROPERTY_BATHROOMS";
    public static final String COLUMN_PROPERTY_PRICE = "PROPERTY_PRICE";
    public static final String COLUMN_PROPERTY_DOORS = "PROPERTY_DOORS";
    public static final String COLUMN_PROPERTY_WINDOWS = "PROPERTY_WINDOWS";
    public static final String COLUMN_TABLE2_ID = "ID";
    public static final String COLUMN_ID = COLUMN_TABLE2_ID;
    public static final String REPORTS_TABLE = "REPORTS_TABLE";
    public static final String COLUMN_DAY = "DAY";
    public static final String COLUMN_MONTH = "MONTH";
    public static final String COLUMN_YEAR = "YEAR";
    public static final String COLUMN_INTEREST = "INTEREST";
    public static final String COLUMN_OFFERPRICE = "OFFERPRICE";
    public static final String COLUMN_EXPIRYDAY = "EXPIRYDAY";
    public static final String COLUMN_EXPIRYMONTH = "EXPIRYMONTH";
    public static final String COLUMN_EXPIRYYEAR = "EXPIRYYEAR";
    public static final String COLUMN_CONDITIONS = "CONDITIONS";
    public static final String COLUMN_COMMENTS = "COMMENTS";
    public static final String COLUMN_PRONAME = "PRONAME";
    /////
    ///TABLE REPORTS



    public DataBaseHelper(@Nullable Context context) {
        super(context, "property.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + PROPERTIES + "(" + COLUMN_ID + " INTEGER primary key autoincrement, " + COLUMN_PROPERTY_NAME + " TEXT, " + COLUMN_PROPERTY_TYPE + " TEXT, " + COLUMN_PROPERTY_LEASE_TYPE + " TEXT, " + COLUMN_PROPERTY_LOCATION + " TEXT, " + COLUMN_PROPERTY_SIZE + " TEXT, " + COLUMN_PROPERTY_AMENITIES + " TEXT, " + COLUMN_PROPERTY_DESCRIPTION + " TEXT, " + COLUMN_PROPERTY_BEDROOMS + " TEXT, " + COLUMN_PROPERTY_BATHROOMS + " TEXT, " + COLUMN_PROPERTY_PRICE + " TEXT, " + COLUMN_PROPERTY_DOORS + " TEXT, " + COLUMN_PROPERTY_WINDOWS + " TEXT)";
        String createTableStatement2 = "CREATE TABLE " + REPORTS_TABLE + " (" + COLUMN_TABLE2_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_DAY + " TEXT, " + COLUMN_MONTH + " text, " + COLUMN_YEAR + " TEXT, " + COLUMN_INTEREST + " TEXT, " + COLUMN_OFFERPRICE + " TEXT, " + COLUMN_EXPIRYDAY + ", TEXT, " + COLUMN_EXPIRYMONTH + " TEXT, " + COLUMN_EXPIRYYEAR + " TEXT, " + COLUMN_CONDITIONS + " TEXT, " + COLUMN_COMMENTS + " TEXT, " + COLUMN_PRONAME + " TEXT)";
        db.execSQL(createTableStatement);
        db.execSQL(createTableStatement2);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean addOne(PropertyModel propertymodel)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_PROPERTY_NAME, propertymodel.getPropertyName());
        cv.put(COLUMN_PROPERTY_TYPE, propertymodel.getPropertyType());
        cv.put(COLUMN_PROPERTY_LEASE_TYPE, propertymodel.getPropertyLeaseType());
        cv.put(COLUMN_PROPERTY_LOCATION, propertymodel.getPropertyLocation());
        cv.put(COLUMN_PROPERTY_SIZE, propertymodel.getPropertySize());
        cv.put(COLUMN_PROPERTY_AMENITIES, propertymodel.getPropertyAmenities());
        cv.put(COLUMN_PROPERTY_DESCRIPTION, propertymodel.getPropertyDescription());
        cv.put(COLUMN_PROPERTY_BEDROOMS, propertymodel.getPropertyBedrooms());
        cv.put(COLUMN_PROPERTY_BATHROOMS, propertymodel.getPropertybathrooms());
        cv.put(COLUMN_PROPERTY_PRICE, propertymodel.getPropertyPrice());
        cv.put(COLUMN_PROPERTY_DOORS, propertymodel.getPropertyDoors());
        cv.put(COLUMN_PROPERTY_WINDOWS, propertymodel.getPropertyWindows());

        long insert = db.insert(PROPERTIES, null, cv);

        if (insert==1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }

        public boolean addRep(ReportModel reportmodel)
        {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put(COLUMN_DAY, reportmodel.getDay());
            cv.put(COLUMN_MONTH, reportmodel.getMonth());
            cv.put(COLUMN_YEAR, reportmodel.getYear());
            cv.put(COLUMN_INTEREST, reportmodel.getInterest());
            cv.put(COLUMN_OFFERPRICE, reportmodel.getOfferPrice());
            cv.put(COLUMN_EXPIRYDAY, reportmodel.getExpiryDay());
            cv.put(COLUMN_EXPIRYMONTH, reportmodel.getExpiryMonth());
            cv.put(COLUMN_EXPIRYYEAR, reportmodel.getExpiryYear());
            cv.put(COLUMN_CONDITIONS, reportmodel.getConditions());
            cv.put(COLUMN_COMMENTS, reportmodel.getComments());
            long insert = db.insert(REPORTS_TABLE, null, cv);
            if(insert==-1)
            {
                return false;
            }else
            {
                return true;
            }

        }
        public boolean deleteOne(PropertyModel propertyModel)
        {
            SQLiteDatabase db = this.getWritableDatabase();
            String queryString="DELETE FROM " + PROPERTIES + " WHERE " + COLUMN_ID + " = " + propertyModel.getId();
            Cursor cursor = db.rawQuery(queryString, null);
            if(cursor.moveToFirst())
            {
                return true;


            }
            else
            {
                return false;
            }
        }
    public List<PropertyModel>getEveryone()
    {
        List<PropertyModel> returnList= new ArrayList<>();

        //get from db

        String queryString = "SELECT * FROM " + PROPERTIES;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);
        if(cursor.moveToFirst())
        {
            do {
                int propertyID=cursor.getInt(0);
                String propertyName=cursor.getString(1);
                String propertyType=cursor.getString(2);
                String propertyLeaseType=cursor.getString(3);
                String propertyLocation=cursor.getString(4);
                String propertySize=cursor.getString(5);
                String propertyAmenities=cursor.getString(6);
                String propertyDescription=cursor.getString(7);
                String propertyBedrooms=cursor.getString(8);
                String propertyBathrooms=cursor.getString(9);
                String propertyPrice=cursor.getString(10);
                String propertyDoors=cursor.getString(11);
                String propertyWindows=cursor.getString(12);

                PropertyModel newProperty = new PropertyModel(propertyID, propertyName, propertyType, propertyLeaseType, propertyLocation, propertySize, propertyAmenities, propertyDescription, propertyBedrooms, propertyBathrooms, propertyPrice, propertyDoors, propertyWindows);
                returnList.add(newProperty);

                } while(cursor.moveToNext());

        }else
        {

        }

        db.close();
        cursor.close();
        return returnList;
    }
    public boolean deleteAll(PropertyModel propertyModel)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        String queryString="DELETE FROM " + PROPERTIES ;
        Cursor cursor = db.rawQuery(queryString, null);
        if(cursor.moveToFirst())
        {
            return true;


        }
        else
        {
            return false;
        }
    }
  // public boolean searching(PropertyModel propertyModel)
   // {
      // Searching searching = new Searching();
       // String name = searching.name;
      // SQLiteDatabase db = this.getReadableDatabase();
      // String querystring3= "SELECT * FROM " + PROPERTIES + " WHERE " + COLUMN_PROPERTY_NAME + " == " + name;
          //     db.execSQL(querystring3);
           //    return true;



  //  }
  public List<PropertyModel>getOne()
  {
      PropertyModel myProperty = new PropertyModel();
      Searching srch = new Searching();
      String proName2 = srch.et_enterName.getText().toString();
      List<PropertyModel> returnList= new ArrayList<>();

      //get from db

      //String queryString = srch.queryString2;
      String queryString = "SELECT * FROM " + PROPERTIES + " WHERE PROPERTY_NAME = " + proName2;


      SQLiteDatabase db = this.getReadableDatabase();
      Cursor cursor = db.rawQuery(queryString, null);
      if(cursor.moveToFirst())
      {
          do {
              int propertyID=cursor.getInt(0);
              String propertyName=cursor.getString(1);
              String propertyType=cursor.getString(2);
              String propertyLeaseType=cursor.getString(3);
              String propertyLocation=cursor.getString(4);
              String propertySize=cursor.getString(5);
              String propertyAmenities=cursor.getString(6);
              String propertyDescription=cursor.getString(7);
              String propertyBedrooms=cursor.getString(8);
              String propertyBathrooms=cursor.getString(9);
              String propertyPrice=cursor.getString(10);
              String propertyDoors=cursor.getString(11);
              String propertyWindows=cursor.getString(12);

              PropertyModel newProperty = new PropertyModel(propertyID, propertyName, propertyType, propertyLeaseType, propertyLocation, propertySize, propertyAmenities, propertyDescription, propertyBedrooms, propertyBathrooms, propertyPrice, propertyDoors, propertyWindows);
              returnList.add(newProperty);

          } while(cursor.moveToNext());

      }else
      {

      }

      db.close();
      cursor.close();
      return returnList;
  }

}
