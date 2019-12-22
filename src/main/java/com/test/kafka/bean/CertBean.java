package com.test.kafka.bean;

import lombok.Data;

/**
 * @author machao
 * @date 2019/12/19
 * @time 9:07
 * @description
 **/
@Data
public class CertBean {
    private String sni;
    private String fingerprint;
    private String cert;
    private String tfe_ip;


    public CertBean(String sni,String fingerprint,String tfe_ip,Integer i){
            this.cert = baseCert;
        this.sni =sni;
        this.fingerprint = fingerprint;
        this.tfe_ip=tfe_ip;
    }
    public static final String wrongBaseCert = "11123asas2123";
    public static final String baseCert = "-----BEGIN CERTIFICATE-----\n" +
            "MIIClDCCAXygAwIBAgIBATANBgkqhkiG9w0BAQsFADA+MSAwHgYDVQQDDBdUYW5n\n" +
            "byBTZWN1cmUgR2F0ZXdheSBDQTEaMBgGA1UECgwRTWFzZXJhdGkgU29sdXRpb24w\n" +
            "HhcNMTkwNjE0MDgzNDMwWhcNMjAwNjEzMDgzNDMwWjA3MQswCQYDVQQGEwJDTjEQ\n" +
            "MA4GA1UECAwHYmVpamluZzEWMBQGA1UEAwwNd3d3LmFtYXpvbi5jbjCBnzANBgkq\n" +
            "hkiG9w0BAQEFAAOBjQAwgYkCgYEArJA4dY19wCOuJZeu0uIv2RwCEIhVKEvug2Kl\n" +
            "0OFOKK8z33jEp4xirf7LE6ZNDw0f+9wWMrIXw0ayuvIZ3xek4lrDgTIwJFjCmejQ\n" +
            "3kNwsPnkk1wa10CjBzunhLX1uhAj5vHuA4xSj5v44WGYwlehN5KKNgUh2PEWHXsR\n" +
            "p1Up4YMCAwEAAaMoMCYwJAYDVR0RBB0wG4IMKi5hbWF6b24uY29tggsqLmFtYXpv\n" +
            "bi5jbjANBgkqhkiG9w0BAQsFAAOCAQEALYygqn6vFrV5QgzXTv5iHIa7BUwyek8T\n" +
            "j08BIhpNQe5JhYC0OgRzDyW8tbM1LLzM+raPyCcE7F7HN/Dghhaa0iu2hnBJVm8n\n" +
            "i1cykuOK9IIYSavUYNpcxfrChOl4LvNniSSvSQWQROllBO8tfugvTtPoPNYcHrWj\n" +
            "5Ky2HkKut/Wsyh3fC87GPtP3a3UDKiRM+pSOji9wrlFF2quZ20vnRvhiU5a5F7BU\n" +
            "mYxxWf5KB4//kYSm+ir0FhNII3gumpuB/tV/yo5Y9J1A9Gb57AqE62OMFJnmoUvw\n" +
            "cSHPg+DMIApeOyA6Vg2kLFq+jr+JP9xHnim0w1TM8wftfe91opawqA==\n" +
            "-----END CERTIFICATE-----";
}
