package local.rogerdom.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer ticket;
    private String contato;
    private String categoria;
    private Integer tipoServico;
    private String servico;	//equivale ao detalhamento da categoria
    private LocalDate dataCriacao;
    private Date dataFinalizacao;
    private Integer situacao;

    public Servico() {
    }

    public Servico(Integer id, Integer ticket, String contato, String categoria, Integer tipoServico, String servico, LocalDate dataCriacao, Date dataFinalizacao, Integer situacao) {
        this.id = id;
        this.ticket = ticket;
        this.contato = contato;
        this.categoria = categoria;
        this.tipoServico = tipoServico;
        this.servico = servico;
        this.dataCriacao = dataCriacao;
        this.dataFinalizacao = dataFinalizacao;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(Integer tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Date dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }

    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "servico{" +
                "id=" + id +
                ", ticket=" + ticket +
                ", contato='" + contato + '\'' +
                ", categoria='" + categoria + '\'' +
                ", tipoServico=" + tipoServico +
                ", servico='" + servico + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", dataFinalizacao=" + dataFinalizacao +
                ", situacao=" + situacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Servico)) return false;
        Servico servico = (Servico) o;
        return getId().equals(servico.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
