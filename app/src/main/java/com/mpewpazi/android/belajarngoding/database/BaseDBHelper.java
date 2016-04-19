package com.mpewpazi.android.belajarngoding.database;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mpewpazi on 4/8/16.
 */
public class BaseDBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "shipyard.db";

    //FORM GALPAL 1 TABEL
    public static final String FORM_GALPAL1_TABLE_NAME = "form_galpal1";
    public static final String FORM_GALPAL1_COLUMN_ID = "id";
    public static final String FORM_GALPAL1_COLUMN_NAMA_PERUSAHAAN = "nama_perusahaan";
    public static final String FORM_GALPAL1_COLUMN_STATUS_KEPEMILIKAN_USAHA = "status_kepemilikan_usaha";
    public static final String FORM_GALPAL1_COLUMN_NOMOR_TELEPON = "nomor_telepon";
    public static final String FORM_GALPAL1_COLUMN_FAX = "fax";
    public static final String FORM_GALPAL1_COLUMN_ALAMAT = "alamat";
    public static final String FORM_GALPAL1_COLUMN_KELURAHAN="kelurahan";
    public static final String FORM_GALPAL1_COLUMN_KECAMATAN="kecamatan";
    public static final String FORM_GALPAL1_COLUMN_PROPINSI="propinsi";
    public static final String FORM_GALPAL1_COLUMN_KABUPATEN="kabupaten";
    public static final String FORM_GALPAL1_COLUMN_KODE_POS="kode_pos";
    public static final String FORM_GALPAL1_COLUMN_ANGGOTA_ASOSIASI="anggota_asosiasi";
    public static final String FORM_GALPAL1_COLUMN_KATEGORI_PERUSAHAAN="kategori_perusahaan";
    public static final String FORM_GALPAL1_COLUMN_CP="contact_person";
    public static final String FORM_GALPAL1_COLUMN_NO_CP="no_contact_person";
    public static final String FORM_GALPAL1_COLUMN_JABATAN="jabatan";
    public static final String FORM_GALPAL1_COLUMN_EMAIL_CP="email_cp";


    //FORM GALPAL3 TABEL
    public static final String FORM_GALPAL3_TABLE_NAME = "form_galpal3";
    public static final String FORM_GALPAL3_COLUMN_ID = "id";
    public static final String FORM_GALPAL3_COLUMN_NAMA_PERUSAHAAN = "nama_perusahaan";
    public static final String FORM_GALPAL3_COLUMN_NAMA_GALANGAN = "nama_galangan";
    public static final String FORM_GALPAL3_COLUMN_NOMOR_DOCK = "nomor_dock";
    public static final String FORM_GALPAL3_COLUMN_NOMOR_TELEPON = "nomor_telepon";
    public static final String FORM_GALPAL3_COLUMN_FAX = "fax";
    public static final String FORM_GALPAL3_COLUMN_ALAMAT = "alamat";
    public static final String FORM_GALPAL3_COLUMN_KELURAHAN="kelurahan";
    public static final String FORM_GALPAL3_COLUMN_KECAMATAN="kecamatan";
    public static final String FORM_GALPAL3_COLUMN_PROPINSI="propinsi";
    public static final String FORM_GALPAL3_COLUMN_KABUPATEN="kabupaten";
    public static final String FORM_GALPAL3_COLUMN_KODE_POS="kode_pos";
    public static final String FORM_GALPAL3_COLUMN_LONGITUDE = "longitude";
    public static final String FORM_GALPAL3_COLUMN_LATITUDE = "latitude";
    public static final String FORM_GALPAL3_COLUMN_KATEGORI_GALANGAN="kategori_galangan";
    public static final String FORM_GALPAL3_COLUMN_CP="contact_person";
    public static final String FORM_GALPAL3_COLUMN_NO_CP="no_contact_person";
    public static final String FORM_GALPAL3_COLUMN_JABATAN="jabatan";
    public static final String FORM_GALPAL3_COLUMN_EMAIL_CP="email_cp";

    //SUDAH SESUAI DENGAN DATABASE CENTRAL
    //FORM GALPAL 19 TABEL
    public static final String FORM_GALPAL19_TABLE_NAME = "f1_organisasi_bengkel";
    public static final String FORM_GALPAL19_COLUMN_ID = "id_f1_organisasi_bengkel";
    public static final String FORM_GALPAL19_COLUMN_NAMA_BENGKEL = "nama_tempat";
    public static final String FORM_GALPAL19_COLUMN_LUAS = "luas";
    public static final String FORM_GALPAL19_COLUMN_DIMENSI = "dimensi";
    public static final String FORM_GALPAL19_COLUMN_KAPASITAS = "kapasitas";
    public static final String FORM_GALPAL19_COLUMN_STATUS = "status";
    public static final String FORM_GALPAL19_COLUMN_JARAK = "jarak";
    public static final String FORM_GALPAL19_COLUMN_CREATED_DATE = "created_date";
    public static final String FORM_GALPAL19_COLUMN_CREATED_USER = "created_user";
    public static final String FORM_GALPAL19_COLUMN_CREATED_IP_ADDRESS = "created_ip_address";
    public static final String FORM_GALPAL19_COLUMN_MODIFIED_DATE = "modified_date";
    public static final String FORM_GALPAL19_COLUMN_MODIFIED_USER = "modified_user";
    public static final String FORM_GALPAL19_COLUMN_MODIFIED_IP_ADDRESS = "modified_ip_address";


    //FORM KOMPAL 1 TABEL
    public static final String FORM_KOMPAL1_TABLE_NAME = "form_kompal1";
    public static final String FORM_KOMPAL1_COLUMN_ID = "id";
    public static final String FORM_KOMPAL1_COLUMN_JARAK_KEDALAMAN = "jarak_kedalaman";
    public static final String FORM_KOMPAL1_COLUMN_AIR_PELAYARAN = "air_pelayaran";
    public static final String FORM_KOMPAL1_COLUMN_PASANG_SURUT = "pasang_surut";
    public static final String FORM_KOMPAL1_COLUMN_ARUS = "arus";
    public static final String FORM_KOMPAL1_COLUMN_GELOMBANG = "gelombang";
    public static final String FORM_KOMPAL1_COLUMN_PANJANG_WATERFRONT = "panjang_waterfront";
    public static final String FORM_KOMPAL1_COLUMN_LUAS_LAHAN = "luas_lahan";
    public static final String FORM_KOMPAL1_COLUMN_KETERSEDIAAN_LAHAN = "ketersediaan_lahan";
    public static final String FORM_KOMPAL1_COLUMN_LAHAN_PRODUKTIF = "lahan_produktif";
    public static final String FORM_KOMPAL1_COLUMN_LAHAN_PEMUKIMAN = "lahan_pemukiman";
    public static final String FORM_KOMPAL1_COLUMN_DAYA_DUKUNG = "daya_dukung";
    public static final String FORM_KOMPAL1_COLUMN_KELANDAIAAN = "kelandaian";
    public static final String FORM_KOMPAL1_COLUMN_DEKAT_JALAN = "dekat_jalan";
    public static final String FORM_KOMPAL1_COLUMN_KOTA = "kota";
    public static final String FORM_KOMPAL1_COLUMN_INTERKONEKSI_ANGKUTAN = "interkoneksi_angkutan";
    public static final String FORM_KOMPAL1_COLUMN_NILAI_EKONOMI = "nilai_ekonomi";
    public static final String FORM_KOMPAL1_COLUMN_PERKEMBANGAN_WILAYAH = "perkembangan_wilayah";
    public static final String FORM_KOMPAL1_COLUMN_RUTWR = "rutwr";



    //FORM KOMPAL2 TABEL
    public static final String FORM_KOMPAL2_TABLE_NAME = "form_kompal2";
    public static final String FORM_KOMPAL2_COLUMN_ID = "id";
    public static final String FORM_KOMPAL2_COLUMN_BAHAN_BAKU = "bahan_Baku";
    public static final String FORM_KOMPAL2_COLUMN_MESIN_SISTEM_ELEKTRIKAL = "mesin_sistem_elektrikal";
    public static final String FORM_KOMPAL2_COLUMN_PERLENGKAPAN_KAPAL = "perlengkapan_kapal";








    public BaseDBHelper(Context context)
    {
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub

        //create tabel formgalapal1
        db.execSQL(
                "create table "+FORM_GALPAL1_TABLE_NAME+
                        "("+FORM_GALPAL1_COLUMN_ID+" integer primary key ," +
                        FORM_GALPAL1_COLUMN_NAMA_PERUSAHAAN +" text," +
                        FORM_GALPAL1_COLUMN_STATUS_KEPEMILIKAN_USAHA +" text," +
                        FORM_GALPAL1_COLUMN_NOMOR_TELEPON +" text," +
                        FORM_GALPAL1_COLUMN_FAX +" text," +
                        FORM_GALPAL1_COLUMN_ALAMAT +" text," +
                        FORM_GALPAL1_COLUMN_KELURAHAN +" text," +
                        FORM_GALPAL1_COLUMN_KECAMATAN +" text," +
                        FORM_GALPAL1_COLUMN_KABUPATEN +" text," +
                        FORM_GALPAL1_COLUMN_PROPINSI +" text," +
                        FORM_GALPAL1_COLUMN_KODE_POS +" text," +
                        FORM_GALPAL1_COLUMN_ANGGOTA_ASOSIASI +" text," +
                        FORM_GALPAL1_COLUMN_KATEGORI_PERUSAHAAN +" text," +
                        FORM_GALPAL1_COLUMN_CP +" text," +
                        FORM_GALPAL1_COLUMN_NO_CP +" text," +
                        FORM_GALPAL1_COLUMN_JABATAN +" text," +
                        FORM_GALPAL1_COLUMN_EMAIL_CP+" text)"
        );


        //create tabel formgalpal3
        db.execSQL(
                "create table "+FORM_GALPAL3_TABLE_NAME+
                        "("+FORM_GALPAL3_COLUMN_ID+" integer primary key ," +
                        FORM_GALPAL3_COLUMN_NAMA_GALANGAN +" text," +
                        FORM_GALPAL3_COLUMN_NAMA_PERUSAHAAN +" text," +
                        FORM_GALPAL3_COLUMN_NOMOR_DOCK +" text," +
                        FORM_GALPAL3_COLUMN_NOMOR_TELEPON +" text," +
                        FORM_GALPAL3_COLUMN_FAX +" text," +
                        FORM_GALPAL3_COLUMN_ALAMAT +" text," +
                        FORM_GALPAL3_COLUMN_KELURAHAN +" text," +
                        FORM_GALPAL3_COLUMN_KECAMATAN +" text," +
                        FORM_GALPAL3_COLUMN_PROPINSI +" text," +
                        FORM_GALPAL3_COLUMN_KABUPATEN +" text," +
                        FORM_GALPAL3_COLUMN_KODE_POS +" text," +
                        FORM_GALPAL3_COLUMN_LATITUDE +" text," +
                        FORM_GALPAL3_COLUMN_LONGITUDE +" text," +
                        FORM_GALPAL3_COLUMN_KATEGORI_GALANGAN +" text," +
                        FORM_GALPAL3_COLUMN_CP +" text," +
                        FORM_GALPAL3_COLUMN_NO_CP +" text," +
                        FORM_GALPAL3_COLUMN_EMAIL_CP +" text," +
                        FORM_GALPAL3_COLUMN_JABATAN +" text)"
        );

        //create tabel formgalpal19
        //foreign key belum dimasukan
        db.execSQL(
                "create table "+FORM_GALPAL19_TABLE_NAME+
                        "("+FORM_GALPAL19_COLUMN_ID+" integer primary key auto increment ," +
                        FORM_GALPAL19_COLUMN_NAMA_BENGKEL +" text," +
                        FORM_GALPAL19_COLUMN_LUAS +" integer," +
                        FORM_GALPAL19_COLUMN_DIMENSI +" text," +
                        FORM_GALPAL19_COLUMN_KAPASITAS +" integer," +
                        FORM_GALPAL19_COLUMN_STATUS +" text," +
                        FORM_GALPAL19_COLUMN_JARAK +" integer," +
                        FORM_GALPAL19_COLUMN_CREATED_DATE +" date," +
                        FORM_GALPAL19_COLUMN_CREATED_USER +" text," +
                        FORM_GALPAL19_COLUMN_CREATED_IP_ADDRESS +" text," +
                        FORM_GALPAL19_COLUMN_MODIFIED_DATE +" date," +
                        FORM_GALPAL19_COLUMN_MODIFIED_USER +" text," +
                        FORM_GALPAL19_COLUMN_MODIFIED_IP_ADDRESS +" text)"
        );


        //create tabel formkompal1
        db.execSQL(
                "create table "+FORM_KOMPAL1_TABLE_NAME+
                        "("+FORM_KOMPAL1_COLUMN_ID+" integer primary key ," +
                        FORM_KOMPAL1_COLUMN_JARAK_KEDALAMAN +" text," +
                        FORM_KOMPAL1_COLUMN_AIR_PELAYARAN +" text," +
                        FORM_KOMPAL1_COLUMN_PASANG_SURUT +" text," +
                        FORM_KOMPAL1_COLUMN_ARUS +" text," +
                        FORM_KOMPAL1_COLUMN_GELOMBANG +" text," +
                        FORM_KOMPAL1_COLUMN_PANJANG_WATERFRONT +" text," +
                        FORM_KOMPAL1_COLUMN_LUAS_LAHAN +" text," +
                        FORM_KOMPAL1_COLUMN_KETERSEDIAAN_LAHAN +" text," +
                        FORM_KOMPAL1_COLUMN_LAHAN_PRODUKTIF +" text," +
                        FORM_KOMPAL1_COLUMN_LAHAN_PEMUKIMAN +" text," +
                        FORM_KOMPAL1_COLUMN_DAYA_DUKUNG +" text," +
                        FORM_KOMPAL1_COLUMN_KELANDAIAAN +" text," +
                        FORM_KOMPAL1_COLUMN_DEKAT_JALAN +" text," +
                        FORM_KOMPAL1_COLUMN_KOTA +" text," +
                        FORM_KOMPAL1_COLUMN_INTERKONEKSI_ANGKUTAN +" text," +
                        FORM_KOMPAL1_COLUMN_NILAI_EKONOMI +" text," +
                        FORM_KOMPAL1_COLUMN_RUTWR +" text," +
                        FORM_KOMPAL1_COLUMN_PERKEMBANGAN_WILAYAH +" text)"
        );

        //create tabel formkompal2
        db.execSQL(
                "create table " + FORM_KOMPAL2_TABLE_NAME +
                        "(" + FORM_KOMPAL2_COLUMN_ID + " integer primary key ," +
                        FORM_KOMPAL2_COLUMN_BAHAN_BAKU + " text," +
                        FORM_KOMPAL2_COLUMN_MESIN_SISTEM_ELEKTRIKAL + " text," +
                        FORM_KOMPAL2_COLUMN_PERLENGKAPAN_KAPAL + " text)"
        );


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS "+FORM_GALPAL1_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+FORM_GALPAL3_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+FORM_KOMPAL1_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+FORM_KOMPAL2_TABLE_NAME);
        onCreate(db);
    }

    public Cursor getDataForm(int id, String tableName){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+tableName+" where id="+id+"", null );
        return res;

    }

    public boolean checkIsDataAlreadyInDBorNot(int id, String tableName) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+tableName+" where id="+id+"", null );
        if(res.getCount() <= 0){
            return false;
        }
        return true;
    }

    public int numberOfRows(String tableName){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, tableName);
        return numRows;
    }

    public Integer deleteFormGalpal1 (Integer id, String tableName)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(tableName,
                "id = ? ",
                new String[] { Integer.toString(id) });
    }
}
