package com.cpd.hotel_system.lkml_hotel_management_service_api.util;

import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.SQLException;

@Service
public class ByteCodeHandler {

    public Blob stringToBlob(String str) throws SQLException{

        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        return new SerialBlob(bytes);

    }

    public String blobToString(Blob blob) throws SQLException{
        int blobLength = (int)blob.length();
        byte[] bytes = blob.getBytes(1, blobLength);
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
