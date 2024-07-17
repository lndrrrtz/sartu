package net.edu.sartuoauth.core.facades;

import net.edu.sartuoauth.core.beans.RegistroAuditoria;

public interface RegistroAuditoriaFacade {
	/**
	 * Inserta un registro de auditoria
	 * 
	 * @param registroAuditoria Datos del registro de auditoria
	 * @return Resultado del proceso. 1 = se ha insertado la auditoría, 0 no se ha insertado la auditoría
	 */
	int registrarAcceso(RegistroAuditoria registroAuditoria);
}
