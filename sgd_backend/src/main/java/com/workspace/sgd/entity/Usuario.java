package com.workspace.sgd.entity;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USUARIO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDUSUARIO;
	private Integer	JEFE;
	private Integer IDREEMPLAZO;
	private String USUARIO;
	private String CLAVE;
	private String NOMBRES;
	private String APELLIDOS;
	private String CORREO;
	private String USUARIOFINAL;
	private String ENVIOCORREO;
	private Timestamp FECHAINICIALREEMPLAZO;
	private Timestamp FECHAFINALREEMPLAZO;
	private String ESTADO;
	private Integer IDUNIDAD;
	private String TEMA;
	private String BANDEJAAGRUPADA;
	private String CLAVE_SIGED;
	private String FLAGVIEWTRAZABILIDAD;
	private Integer REGISTROSBANDEJA;
	private Integer GRUPOFEDATARIO;
	private String SIGLASFEDATARIO;
	private String FLAGDOCUMENTOCF;
	private Integer IDFUNCION;
	private Integer IDROL;
	private String TIPODOCUMENTO;
	private String NRODOCUMENTO;
	private String FLAGVIEWADMINISTRADO;
	private Timestamp FECHACREACION;
	private Timestamp FECHAMODIFICACION;
	private String ESTADOEXCEPCION;
	private String FIRMAAPP;
	private String FIRMAACTIVOAPP;
	private String FIRMAUSUARIOAPP;
	private String FIRMAPASSWORDAPP;
	private String TOKENFIREBASE;
	private String PUSHAPP;
	private String PUSHWEB;
	public Long getIDUSUARIO() {
		return IDUSUARIO;
	}
	public void setIDUSUARIO(Long iDUSUARIO) {
		IDUSUARIO = iDUSUARIO;
	}
	public Integer getJEFE() {
		return JEFE;
	}
	public void setJEFE(Integer jEFE) {
		JEFE = jEFE;
	}
	public Integer getIDREEMPLAZO() {
		return IDREEMPLAZO;
	}
	public void setIDREEMPLAZO(Integer iDREEMPLAZO) {
		IDREEMPLAZO = iDREEMPLAZO;
	}
	public String getUSUARIO() {
		return USUARIO;
	}
	public void setUSUARIO(String uSUARIO) {
		USUARIO = uSUARIO;
	}
	public String getCLAVE() {
		return CLAVE;
	}
	public void setCLAVE(String cLAVE) {
		CLAVE = cLAVE;
	}
	public String getNOMBRES() {
		return NOMBRES;
	}
	public void setNOMBRES(String nOMBRES) {
		NOMBRES = nOMBRES;
	}
	public String getAPELLIDOS() {
		return APELLIDOS;
	}
	public void setAPELLIDOS(String aPELLIDOS) {
		APELLIDOS = aPELLIDOS;
	}
	public String getCORREO() {
		return CORREO;
	}
	public void setCORREO(String cORREO) {
		CORREO = cORREO;
	}
	public String getUSUARIOFINAL() {
		return USUARIOFINAL;
	}
	public void setUSUARIOFINAL(String uSUARIOFINAL) {
		USUARIOFINAL = uSUARIOFINAL;
	}
	public String getENVIOCORREO() {
		return ENVIOCORREO;
	}
	public void setENVIOCORREO(String eNVIOCORREO) {
		ENVIOCORREO = eNVIOCORREO;
	}
	public Timestamp getFECHAINICIALREEMPLAZO() {
		return FECHAINICIALREEMPLAZO;
	}
	public void setFECHAINICIALREEMPLAZO(Timestamp fECHAINICIALREEMPLAZO) {
		FECHAINICIALREEMPLAZO = fECHAINICIALREEMPLAZO;
	}
	public Timestamp getFECHAFINALREEMPLAZO() {
		return FECHAFINALREEMPLAZO;
	}
	public void setFECHAFINALREEMPLAZO(Timestamp fECHAFINALREEMPLAZO) {
		FECHAFINALREEMPLAZO = fECHAFINALREEMPLAZO;
	}
	public String getESTADO() {
		return ESTADO;
	}
	public void setESTADO(String eSTADO) {
		ESTADO = eSTADO;
	}
	public Integer getIDUNIDAD() {
		return IDUNIDAD;
	}
	public void setIDUNIDAD(Integer iDUNIDAD) {
		IDUNIDAD = iDUNIDAD;
	}
	public String getTEMA() {
		return TEMA;
	}
	public void setTEMA(String tEMA) {
		TEMA = tEMA;
	}
	public String getBANDEJAAGRUPADA() {
		return BANDEJAAGRUPADA;
	}
	public void setBANDEJAAGRUPADA(String bANDEJAAGRUPADA) {
		BANDEJAAGRUPADA = bANDEJAAGRUPADA;
	}
	public String getCLAVE_SIGED() {
		return CLAVE_SIGED;
	}
	public void setCLAVE_SIGED(String cLAVE_SIGED) {
		CLAVE_SIGED = cLAVE_SIGED;
	}
	public String getFLAGVIEWTRAZABILIDAD() {
		return FLAGVIEWTRAZABILIDAD;
	}
	public void setFLAGVIEWTRAZABILIDAD(String fLAGVIEWTRAZABILIDAD) {
		FLAGVIEWTRAZABILIDAD = fLAGVIEWTRAZABILIDAD;
	}
	public Integer getREGISTROSBANDEJA() {
		return REGISTROSBANDEJA;
	}
	public void setREGISTROSBANDEJA(Integer rEGISTROSBANDEJA) {
		REGISTROSBANDEJA = rEGISTROSBANDEJA;
	}
	public Integer getGRUPOFEDATARIO() {
		return GRUPOFEDATARIO;
	}
	public void setGRUPOFEDATARIO(Integer gRUPOFEDATARIO) {
		GRUPOFEDATARIO = gRUPOFEDATARIO;
	}
	public String getSIGLASFEDATARIO() {
		return SIGLASFEDATARIO;
	}
	public void setSIGLASFEDATARIO(String sIGLASFEDATARIO) {
		SIGLASFEDATARIO = sIGLASFEDATARIO;
	}
	public String getFLAGDOCUMENTOCF() {
		return FLAGDOCUMENTOCF;
	}
	public void setFLAGDOCUMENTOCF(String fLAGDOCUMENTOCF) {
		FLAGDOCUMENTOCF = fLAGDOCUMENTOCF;
	}
	public Integer getIDFUNCION() {
		return IDFUNCION;
	}
	public void setIDFUNCION(Integer iDFUNCION) {
		IDFUNCION = iDFUNCION;
	}
	public Integer getIDROL() {
		return IDROL;
	}
	public void setIDROL(Integer iDROL) {
		IDROL = iDROL;
	}
	public String getTIPODOCUMENTO() {
		return TIPODOCUMENTO;
	}
	public void setTIPODOCUMENTO(String tIPODOCUMENTO) {
		TIPODOCUMENTO = tIPODOCUMENTO;
	}
	public String getNRODOCUMENTO() {
		return NRODOCUMENTO;
	}
	public void setNRODOCUMENTO(String nRODOCUMENTO) {
		NRODOCUMENTO = nRODOCUMENTO;
	}
	public String getFLAGVIEWADMINISTRADO() {
		return FLAGVIEWADMINISTRADO;
	}
	public void setFLAGVIEWADMINISTRADO(String fLAGVIEWADMINISTRADO) {
		FLAGVIEWADMINISTRADO = fLAGVIEWADMINISTRADO;
	}
	public Timestamp getFECHACREACION() {
		return FECHACREACION;
	}
	public void setFECHACREACION(Timestamp fECHACREACION) {
		FECHACREACION = fECHACREACION;
	}
	public Timestamp getFECHAMODIFICACION() {
		return FECHAMODIFICACION;
	}
	public void setFECHAMODIFICACION(Timestamp fECHAMODIFICACION) {
		FECHAMODIFICACION = fECHAMODIFICACION;
	}
	public String getESTADOEXCEPCION() {
		return ESTADOEXCEPCION;
	}
	public void setESTADOEXCEPCION(String eSTADOEXCEPCION) {
		ESTADOEXCEPCION = eSTADOEXCEPCION;
	}
	public String getFIRMAAPP() {
		return FIRMAAPP;
	}
	public void setFIRMAAPP(String fIRMAAPP) {
		FIRMAAPP = fIRMAAPP;
	}
	public String getFIRMAACTIVOAPP() {
		return FIRMAACTIVOAPP;
	}
	public void setFIRMAACTIVOAPP(String fIRMAACTIVOAPP) {
		FIRMAACTIVOAPP = fIRMAACTIVOAPP;
	}
	public String getFIRMAUSUARIOAPP() {
		return FIRMAUSUARIOAPP;
	}
	public void setFIRMAUSUARIOAPP(String fIRMAUSUARIOAPP) {
		FIRMAUSUARIOAPP = fIRMAUSUARIOAPP;
	}
	public String getFIRMAPASSWORDAPP() {
		return FIRMAPASSWORDAPP;
	}
	public void setFIRMAPASSWORDAPP(String fIRMAPASSWORDAPP) {
		FIRMAPASSWORDAPP = fIRMAPASSWORDAPP;
	}
	public String getTOKENFIREBASE() {
		return TOKENFIREBASE;
	}
	public void setTOKENFIREBASE(String tOKENFIREBASE) {
		TOKENFIREBASE = tOKENFIREBASE;
	}
	public String getPUSHAPP() {
		return PUSHAPP;
	}
	public void setPUSHAPP(String pUSHAPP) {
		PUSHAPP = pUSHAPP;
	}
	public String getPUSHWEB() {
		return PUSHWEB;
	}
	public void setPUSHWEB(String pUSHWEB) {
		PUSHWEB = pUSHWEB;
	}
	
	
}
