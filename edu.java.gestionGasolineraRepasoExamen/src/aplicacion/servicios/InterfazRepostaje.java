package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.RepostajeNormal;

/**
 * Interfaz que define los métodos que darán servicio a repostaje
 * @author frand
 *
 */
public interface InterfazRepostaje {
	
	/**
	 * Método que crea un repostaje normal y lo añade a la lista pasada por parametros
	 * Devuelve la lista actualizada
	 * @param listaBD
	 * @return
	 */
	public List<RepostajeNormal> creaRepostajeNormal(List<RepostajeNormal> listaBD);
	
	/**
	 * Método que crea un respotaje factura y lo añade a la lista pasada por parametros
	 * Devuelve la lista actualizada
	 * @param listaBD
	 * @return
	 */
	public List<RepostajeNormal> creaRepostajeFactura(List<RepostajeNormal> listaBD);
	
	/**
	 * Método que muestra por consola todos los repostajes (Normal y factura).
	 * @param listaBD
	 */
	public void mostrarTodosRepostajes(List<RepostajeNormal> listaBD);
}
