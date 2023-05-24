package br.com.fiap.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;

public class ConsultaPk implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer paciente;
	
	private Integer medico;
	
	private Calendar data;

	public Integer getPaciente() {
		return paciente;
	}

	public void setPaciente(Integer paciente) {
		this.paciente = paciente;
	}

	public Integer getMedico() {
		return medico;
	}

	public void setMedico(Integer medico) {
		this.medico = medico;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((medico == null) ? 0 : medico.hashCode());
		result = prime * result + ((paciente == null) ? 0 : paciente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultaPk other = (ConsultaPk) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (medico == null) {
			if (other.medico != null)
				return false;
		} else if (!medico.equals(other.medico))
			return false;
		if (paciente == null) {
			if (other.paciente != null)
				return false;
		} else if (!paciente.equals(other.paciente))
			return false;
		return true;
	}

	
	
	
}
