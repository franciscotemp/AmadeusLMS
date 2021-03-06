/**
Copyright 2008, 2009 UFPE - Universidade Federal de Pernambuco
 
Este arquivo � parte do programa Amadeus Sistema de Gest�o de Aprendizagem, ou simplesmente Amadeus LMS
 
O Amadeus LMS � um software livre; voc� pode redistribui-lo e/ou modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como
publicada pela Funda��o do Software Livre (FSF); na vers�o 2 da Licen�a.
 
Este programa � distribu�do na esperan�a que possa ser �til, mas SEM NENHUMA GARANTIA; sem uma garantia impl�cita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. Veja a Licen�a P�blica Geral GNU para maiores detalhes.
 
Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU, sob o t�tulo "LICENCA.txt", junto com este programa, se n�o, escreva para a Funda��o do Software Livre (FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA.
**/

package br.ufpe.cin.amadeus.amadeus_mobile.bussiness;

import java.util.List;

import br.ufpe.cin.amadeus.amadeus_mobile.basics.NoticeMobile;
import br.ufpe.cin.amadeus.amadeus_mobile.repository.INoticeRepositoryMobile;
import br.ufpe.cin.amadeus.amadeus_mobile.repository.NoticeRepositoryMobile;


public class NoticeBussinessMobile implements INoticeBussinessMobile {

	private INoticeRepositoryMobile repNotice;
	
	public NoticeBussinessMobile() {
		this.repNotice = new NoticeRepositoryMobile();
	}
	/**
	 * Method that returns a Notice List from the User�s Course
	 * @param idCouse - Course Id
	 * @param login -  User login
	 * @return - User�s Course Notice List
	 */
	public List<NoticeMobile> getNoticesCourse(int idCourse, String login) {
		return repNotice.getNoticesCourse(idCourse, login);
	}
	/**
	 * Method that returns the User Notice requested
	 * @param idNotice - Notice Id
	 * @param login	- User login that has the Notice Id
	 * @return - Notice
	 */
	public NoticeMobile getNotice(int idNotice, String login) {
		return repNotice.getNotice(idNotice, login);
	}
	/**
	 *  Method that returns a Notice List from the User�s Module
	 * @param idModule - Module Id
	 * @param login -  User login
	 * @return - User�s Module Notice List
	 */
	public List<NoticeMobile> getNoticesModule(int idModule, String login) {
		return repNotice.getNoticesModule(idModule, login);
	}
	/**
	 * Method that returns the AMADeUs Notice List for the User
	 * @param login	- User login
	 * @return - Notice List
	 */
	public List<NoticeMobile> getNoticesAmadeus(String login) {
		return repNotice.getNoticesAmadeus(login);
	}
	/**
	 * Method that Checks if a Notice was sent
	 * @param idNotice - Notice Id
	 * @return - Boolean if the Notice was sent or not
	 */
	public boolean sent(int idNotice) {
		return repNotice.sent(idNotice);
	}
	/**
	 * Method that Adds a Notice
	 * @param notice - Notice to add
	 */
	public void addNotice(NoticeMobile notice) {
		this.repNotice.addNotice(notice);
	}
	/**
	 * Method that Updates a User Notice
	 * @param notice - Notice Updated
	 * @param login - User Login that has the Notice
	 */
	public void updateNotice(NoticeMobile n, String login){
		this.repNotice.updateNotice(n, login);
	}
	/**
	 * Method that checks if there is a Notice. If exists, returns the Notice id.
	 * If it doesn't exist, returns -1
	 * @param not - Notice to be searched
	 * @return - Notice Id
	 */
	public int existNotice(NoticeMobile notice) {
		return this.repNotice.existNotice(notice);
	}
	/**
	 * Method that returns the Notice requested
	 * @param idNotice - Notice Id
	 * @return - Notice
	 */
	public NoticeMobile getNoticeSMS(int noticeId) {
		return this.repNotice.getNoticeSMS(noticeId);
	}
	
	/**
	 * Method that returns the last id of a notice by course
	 * @param idCourse
	 * @return notice id
	 */
	public int getLastId(int idCourse) {
		return this.repNotice.getLastId(idCourse);
	}
}