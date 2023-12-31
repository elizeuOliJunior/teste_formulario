import java.util.Date;

public class Paciente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String cep;
    private String endereco;
    private String especialidadeMedica;
    private String unidadeClinica;
    private String convenio;
    private Date dataConsulta;
    private String horarioConsulta; 

    // Construtor
    public Paciente(String nome, String cpf, String telefone, String email, String cep, String endereco,
                    String especialidadeMedica, String unidadeClinica, String convenio,
                    Date dataConsulta, String horarioConsulta) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
        this.endereco = endereco;
        this.especialidadeMedica = especialidadeMedica;
        this.unidadeClinica = unidadeClinica;
        this.convenio = convenio;
        this.dataConsulta = dataConsulta;
        this.horarioConsulta = horarioConsulta;
    }


    // Métodos getters

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCep() {
        return cep;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getEspecialidadeMedica() {
        return especialidadeMedica;
    }

    public String getUnidadeClinica() {
        return unidadeClinica;
    }

    public String getConvenio() {
        return convenio;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public String getHorarioConsulta() {
        return horarioConsulta;
    }

    // Métodos setters
    public void setId(int Id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setEspecialidadeMedica(String especialidadeMedica) {
        this.especialidadeMedica = especialidadeMedica;
    }

    public void setUnidadeClinica(String unidadeClinica) {
        this.unidadeClinica = unidadeClinica;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void setHorarioConsulta(String horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }
}


