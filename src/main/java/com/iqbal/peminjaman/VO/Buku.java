/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iqbal.peminjaman.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Iqbal
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Buku {
    private Long bukuId;
    private String kode;
    private String judul;
    private String penerbit;
    private String tahunTerbit;
}