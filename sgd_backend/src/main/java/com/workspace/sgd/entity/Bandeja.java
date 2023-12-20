package com.workspace.sgd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name="VISTABANDEJA")
@Immutable
@AllArgsConstructor
@NoArgsConstructor
public class Bandeja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String TIPODOCUMENTO;
    private String DESPACHADO;
    private String TIPOALERTA;
    private String ASUNTO;
    private String CHRESTADO;
    private String ASUNTOEXPEDIENTE;
    private String PRIORIDAD;
    private String DOCUMENTO;
    private String CONCESIONARIO;
    private String URLARCHIVO;
    private String FECHALIMITE;
    private String ESTADO;
    private String ETAPA;
    private String EXPEDIENTE;
    private String CLIENTE;
    private String IDCLIENTE;
    private String ACTIVIDAD;
    private String NUMEROMESAPARTES;
    private String PORCENTAJE_A;
    private String PORCENTAJE_R;
    private String IDPROCESO;
    private String FECHAACCION;
    private String PROPIETARIO;
    private String LEIDO;
    private String ARCHIVOS;
    private String DOCUMENTOREFERENCIA;
    private String IDREMITENTE;
    private String IDACCION;
    private String IDAUTOR;
    private String NUMEROTRAZABILIDAD;
    private String UNIDADPROPIETARIO;
    private String CARGOPROPIETARIO;
    private String UNIDADREMITENTE;
    private String FLAGMULTIPLE;
    private String FLAGATENDIDO;
    private String NROTRAMITE;
    private String ORIGEN;
    private String FIRMADO;
    private String VIRTUAL;
    private String EXTERNO;
    private String UNIDADAUTOR;
    private String DESUNIDADREMITENTE;
    private String DESUNIDADAUTOR;
    private String INICIALES;
    private String INICIALESREMITENTE;
    private String DESCARGOREMITENTE;
    private String CARGOREMITENTE;
    private String LLAVE;
    private String FECHACREACIONTRAZA;
    private String FECHALIMITETRAZA;
    private String PRIORIDADTRAZA;
    private String PROVEIDOTRAZA;
    private String DESPROVEIDOTRAZA;
    private String PENDIENTE;
    private String DESPACHO;
    private String ESTADORECEPCIONVIRTUAL;
    private String NROVIRTUAL;
    private String NROMESAVIRTUAL;
    private String NROTOTALARCHIVOS;
    private String NROTOTALARCHIVOSFIRMADOS;
    private String DESTIPINSTITUCION;
    private String CONTENIDO;
    private String CONFIDENCIAL;
    private String BANDEJAFIRMA;
    private String VERPENDIENTEFIRMA;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTIPODOCUMENTO() {
        return TIPODOCUMENTO;
    }

    public void setTIPODOCUMENTO(String TIPODOCUMENTO) {
        this.TIPODOCUMENTO = TIPODOCUMENTO;
    }

    public String getDESPACHADO() {
        return DESPACHADO;
    }

    public void setDESPACHADO(String DESPACHADO) {
        this.DESPACHADO = DESPACHADO;
    }

    public String getTIPOALERTA() {
        return TIPOALERTA;
    }

    public void setTIPOALERTA(String TIPOALERTA) {
        this.TIPOALERTA = TIPOALERTA;
    }

    public String getASUNTO() {
        return ASUNTO;
    }

    public void setASUNTO(String ASUNTO) {
        this.ASUNTO = ASUNTO;
    }

    public String getCHRESTADO() {
        return CHRESTADO;
    }

    public void setCHRESTADO(String CHRESTADO) {
        this.CHRESTADO = CHRESTADO;
    }

    public String getASUNTOEXPEDIENTE() {
        return ASUNTOEXPEDIENTE;
    }

    public void setASUNTOEXPEDIENTE(String ASUNTOEXPEDIENTE) {
        this.ASUNTOEXPEDIENTE = ASUNTOEXPEDIENTE;
    }

    public String getPRIORIDAD() {
        return PRIORIDAD;
    }

    public void setPRIORIDAD(String PRIORIDAD) {
        this.PRIORIDAD = PRIORIDAD;
    }

    public String getDOCUMENTO() {
        return DOCUMENTO;
    }

    public void setDOCUMENTO(String DOCUMENTO) {
        this.DOCUMENTO = DOCUMENTO;
    }

    public String getCONCESIONARIO() {
        return CONCESIONARIO;
    }

    public void setCONCESIONARIO(String CONCESIONARIO) {
        this.CONCESIONARIO = CONCESIONARIO;
    }

    public String getURLARCHIVO() {
        return URLARCHIVO;
    }

    public void setURLARCHIVO(String URLARCHIVO) {
        this.URLARCHIVO = URLARCHIVO;
    }

    public String getFECHALIMITE() {
        return FECHALIMITE;
    }

    public void setFECHALIMITE(String FECHALIMITE) {
        this.FECHALIMITE = FECHALIMITE;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getETAPA() {
        return ETAPA;
    }

    public void setETAPA(String ETAPA) {
        this.ETAPA = ETAPA;
    }

    public String getEXPEDIENTE() {
        return EXPEDIENTE;
    }

    public void setEXPEDIENTE(String EXPEDIENTE) {
        this.EXPEDIENTE = EXPEDIENTE;
    }

    public String getCLIENTE() {
        return CLIENTE;
    }

    public void setCLIENTE(String CLIENTE) {
        this.CLIENTE = CLIENTE;
    }

    public String getIDCLIENTE() {
        return IDCLIENTE;
    }

    public void setIDCLIENTE(String IDCLIENTE) {
        this.IDCLIENTE = IDCLIENTE;
    }

    public String getACTIVIDAD() {
        return ACTIVIDAD;
    }

    public void setACTIVIDAD(String ACTIVIDAD) {
        this.ACTIVIDAD = ACTIVIDAD;
    }

    public String getNUMEROMESAPARTES() {
        return NUMEROMESAPARTES;
    }

    public void setNUMEROMESAPARTES(String NUMEROMESAPARTES) {
        this.NUMEROMESAPARTES = NUMEROMESAPARTES;
    }

    public String getPORCENTAJE_A() {
        return PORCENTAJE_A;
    }

    public void setPORCENTAJE_A(String PORCENTAJE_A) {
        this.PORCENTAJE_A = PORCENTAJE_A;
    }

    public String getPORCENTAJE_R() {
        return PORCENTAJE_R;
    }

    public void setPORCENTAJE_R(String PORCENTAJE_R) {
        this.PORCENTAJE_R = PORCENTAJE_R;
    }

    public String getIDPROCESO() {
        return IDPROCESO;
    }

    public void setIDPROCESO(String IDPROCESO) {
        this.IDPROCESO = IDPROCESO;
    }

    public String getFECHAACCION() {
        return FECHAACCION;
    }

    public void setFECHAACCION(String FECHAACCION) {
        this.FECHAACCION = FECHAACCION;
    }

    public String getPROPIETARIO() {
        return PROPIETARIO;
    }

    public void setPROPIETARIO(String PROPIETARIO) {
        this.PROPIETARIO = PROPIETARIO;
    }

    public String getLEIDO() {
        return LEIDO;
    }

    public void setLEIDO(String LEIDO) {
        this.LEIDO = LEIDO;
    }

    public String getARCHIVOS() {
        return ARCHIVOS;
    }

    public void setARCHIVOS(String ARCHIVOS) {
        this.ARCHIVOS = ARCHIVOS;
    }

    public String getDOCUMENTOREFERENCIA() {
        return DOCUMENTOREFERENCIA;
    }

    public void setDOCUMENTOREFERENCIA(String DOCUMENTOREFERENCIA) {
        this.DOCUMENTOREFERENCIA = DOCUMENTOREFERENCIA;
    }

    public String getIDREMITENTE() {
        return IDREMITENTE;
    }

    public void setIDREMITENTE(String IDREMITENTE) {
        this.IDREMITENTE = IDREMITENTE;
    }

    public String getIDACCION() {
        return IDACCION;
    }

    public void setIDACCION(String IDACCION) {
        this.IDACCION = IDACCION;
    }

    public String getIDAUTOR() {
        return IDAUTOR;
    }

    public void setIDAUTOR(String IDAUTOR) {
        this.IDAUTOR = IDAUTOR;
    }

    public String getNUMEROTRAZABILIDAD() {
        return NUMEROTRAZABILIDAD;
    }

    public void setNUMEROTRAZABILIDAD(String NUMEROTRAZABILIDAD) {
        this.NUMEROTRAZABILIDAD = NUMEROTRAZABILIDAD;
    }

    public String getUNIDADPROPIETARIO() {
        return UNIDADPROPIETARIO;
    }

    public void setUNIDADPROPIETARIO(String UNIDADPROPIETARIO) {
        this.UNIDADPROPIETARIO = UNIDADPROPIETARIO;
    }

    public String getCARGOPROPIETARIO() {
        return CARGOPROPIETARIO;
    }

    public void setCARGOPROPIETARIO(String CARGOPROPIETARIO) {
        this.CARGOPROPIETARIO = CARGOPROPIETARIO;
    }

    public String getUNIDADREMITENTE() {
        return UNIDADREMITENTE;
    }

    public void setUNIDADREMITENTE(String UNIDADREMITENTE) {
        this.UNIDADREMITENTE = UNIDADREMITENTE;
    }

    public String getFLAGMULTIPLE() {
        return FLAGMULTIPLE;
    }

    public void setFLAGMULTIPLE(String FLAGMULTIPLE) {
        this.FLAGMULTIPLE = FLAGMULTIPLE;
    }

    public String getFLAGATENDIDO() {
        return FLAGATENDIDO;
    }

    public void setFLAGATENDIDO(String FLAGATENDIDO) {
        this.FLAGATENDIDO = FLAGATENDIDO;
    }

    public String getNROTRAMITE() {
        return NROTRAMITE;
    }

    public void setNROTRAMITE(String NROTRAMITE) {
        this.NROTRAMITE = NROTRAMITE;
    }

    public String getORIGEN() {
        return ORIGEN;
    }

    public void setORIGEN(String ORIGEN) {
        this.ORIGEN = ORIGEN;
    }

    public String getFIRMADO() {
        return FIRMADO;
    }

    public void setFIRMADO(String FIRMADO) {
        this.FIRMADO = FIRMADO;
    }

    public String getVIRTUAL() {
        return VIRTUAL;
    }

    public void setVIRTUAL(String VIRTUAL) {
        this.VIRTUAL = VIRTUAL;
    }

    public String getEXTERNO() {
        return EXTERNO;
    }

    public void setEXTERNO(String EXTERNO) {
        this.EXTERNO = EXTERNO;
    }

    public String getUNIDADAUTOR() {
        return UNIDADAUTOR;
    }

    public void setUNIDADAUTOR(String UNIDADAUTOR) {
        this.UNIDADAUTOR = UNIDADAUTOR;
    }

    public String getDESUNIDADREMITENTE() {
        return DESUNIDADREMITENTE;
    }

    public void setDESUNIDADREMITENTE(String DESUNIDADREMITENTE) {
        this.DESUNIDADREMITENTE = DESUNIDADREMITENTE;
    }

    public String getDESUNIDADAUTOR() {
        return DESUNIDADAUTOR;
    }

    public void setDESUNIDADAUTOR(String DESUNIDADAUTOR) {
        this.DESUNIDADAUTOR = DESUNIDADAUTOR;
    }

    public String getINICIALES() {
        return INICIALES;
    }

    public void setINICIALES(String INICIALES) {
        this.INICIALES = INICIALES;
    }

    public String getINICIALESREMITENTE() {
        return INICIALESREMITENTE;
    }

    public void setINICIALESREMITENTE(String INICIALESREMITENTE) {
        this.INICIALESREMITENTE = INICIALESREMITENTE;
    }

    public String getDESCARGOREMITENTE() {
        return DESCARGOREMITENTE;
    }

    public void setDESCARGOREMITENTE(String DESCARGOREMITENTE) {
        this.DESCARGOREMITENTE = DESCARGOREMITENTE;
    }

    public String getCARGOREMITENTE() {
        return CARGOREMITENTE;
    }

    public void setCARGOREMITENTE(String CARGOREMITENTE) {
        this.CARGOREMITENTE = CARGOREMITENTE;
    }

    public String getLLAVE() {
        return LLAVE;
    }

    public void setLLAVE(String LLAVE) {
        this.LLAVE = LLAVE;
    }

    public String getFECHACREACIONTRAZA() {
        return FECHACREACIONTRAZA;
    }

    public void setFECHACREACIONTRAZA(String FECHACREACIONTRAZA) {
        this.FECHACREACIONTRAZA = FECHACREACIONTRAZA;
    }

    public String getFECHALIMITETRAZA() {
        return FECHALIMITETRAZA;
    }

    public void setFECHALIMITETRAZA(String FECHALIMITETRAZA) {
        this.FECHALIMITETRAZA = FECHALIMITETRAZA;
    }

    public String getPRIORIDADTRAZA() {
        return PRIORIDADTRAZA;
    }

    public void setPRIORIDADTRAZA(String PRIORIDADTRAZA) {
        this.PRIORIDADTRAZA = PRIORIDADTRAZA;
    }

    public String getPROVEIDOTRAZA() {
        return PROVEIDOTRAZA;
    }

    public void setPROVEIDOTRAZA(String PROVEIDOTRAZA) {
        this.PROVEIDOTRAZA = PROVEIDOTRAZA;
    }

    public String getDESPROVEIDOTRAZA() {
        return DESPROVEIDOTRAZA;
    }

    public void setDESPROVEIDOTRAZA(String DESPROVEIDOTRAZA) {
        this.DESPROVEIDOTRAZA = DESPROVEIDOTRAZA;
    }

    public String getPENDIENTE() {
        return PENDIENTE;
    }

    public void setPENDIENTE(String PENDIENTE) {
        this.PENDIENTE = PENDIENTE;
    }

    public String getDESPACHO() {
        return DESPACHO;
    }

    public void setDESPACHO(String DESPACHO) {
        this.DESPACHO = DESPACHO;
    }

    public String getESTADORECEPCIONVIRTUAL() {
        return ESTADORECEPCIONVIRTUAL;
    }

    public void setESTADORECEPCIONVIRTUAL(String ESTADORECEPCIONVIRTUAL) {
        this.ESTADORECEPCIONVIRTUAL = ESTADORECEPCIONVIRTUAL;
    }

    public String getNROVIRTUAL() {
        return NROVIRTUAL;
    }

    public void setNROVIRTUAL(String NROVIRTUAL) {
        this.NROVIRTUAL = NROVIRTUAL;
    }

    public String getNROMESAVIRTUAL() {
        return NROMESAVIRTUAL;
    }

    public void setNROMESAVIRTUAL(String NROMESAVIRTUAL) {
        this.NROMESAVIRTUAL = NROMESAVIRTUAL;
    }

    public String getNROTOTALARCHIVOS() {
        return NROTOTALARCHIVOS;
    }

    public void setNROTOTALARCHIVOS(String NROTOTALARCHIVOS) {
        this.NROTOTALARCHIVOS = NROTOTALARCHIVOS;
    }

    public String getNROTOTALARCHIVOSFIRMADOS() {
        return NROTOTALARCHIVOSFIRMADOS;
    }

    public void setNROTOTALARCHIVOSFIRMADOS(String NROTOTALARCHIVOSFIRMADOS) {
        this.NROTOTALARCHIVOSFIRMADOS = NROTOTALARCHIVOSFIRMADOS;
    }

    public String getDESTIPINSTITUCION() {
        return DESTIPINSTITUCION;
    }

    public void setDESTIPINSTITUCION(String DESTIPINSTITUCION) {
        this.DESTIPINSTITUCION = DESTIPINSTITUCION;
    }

    public String getCONTENIDO() {
        return CONTENIDO;
    }

    public void setCONTENIDO(String CONTENIDO) {
        this.CONTENIDO = CONTENIDO;
    }

    public String getCONFIDENCIAL() {
        return CONFIDENCIAL;
    }

    public void setCONFIDENCIAL(String CONFIDENCIAL) {
        this.CONFIDENCIAL = CONFIDENCIAL;
    }

    public String getBANDEJAFIRMA() {
        return BANDEJAFIRMA;
    }

    public void setBANDEJAFIRMA(String BANDEJAFIRMA) {
        this.BANDEJAFIRMA = BANDEJAFIRMA;
    }

    public String getVERPENDIENTEFIRMA() {
        return VERPENDIENTEFIRMA;
    }

    public void setVERPENDIENTEFIRMA(String VERPENDIENTEFIRMA) {
        this.VERPENDIENTEFIRMA = VERPENDIENTEFIRMA;
    }
}
