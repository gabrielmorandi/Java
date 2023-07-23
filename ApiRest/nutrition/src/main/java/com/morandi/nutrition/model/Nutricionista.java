package com.morandi.nutrition.model;

import java.time.LocalDate;

public class Nutricionista {

  private Long id;
  private String nome;
  private LocalDate idade;
  private String codigoRegistro;
  private Long idPaciente;

  public Nutricionista(
    Long id,
    String nome,
    LocalDate idade,
    String codigoRegistro,
    Long idPaciente
  ) {
    this.id = id;
    this.nome = nome;
    this.idade = idade;
    this.codigoRegistro = codigoRegistro;
    this.idPaciente = idPaciente;
  }

  @SuppressWarnings("unused")
  private Nutricionista() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getIdade() {
    return idade;
  }

  public void setIdade(LocalDate idade) {
    this.idade = idade;
  }

  public String getCodigoRegistro() {
    return codigoRegistro;
  }

  public void setCodigoRegistro(String codigoRegistro) {
    this.codigoRegistro = codigoRegistro;
  }

  public Long getIdPaciente() {
    return idPaciente;
  }

  public void setIdPaciente(Long idPaciente) {
    this.idPaciente = idPaciente;
  }
}
