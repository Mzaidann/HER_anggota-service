/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zaidan.anggota.service.repository;

import com.zaidan.anggota.service.entity.Anggota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP ELITE BOOK G2
 */
@Repository
public interface AnggotaRepository extends JpaRepository<Anggota, Long> {
    
    public Anggota findByAnggotaId(Long anggotaId);
    
    public Anggota save(Anggota anggota);
}