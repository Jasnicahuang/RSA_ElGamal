/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chiffrement;

/**
 *
 * @author oorestisime
 */
public interface KeySet {
    
    public SecretKey getSk();
    public PublicKey getPk();
    public Parameters getParams();
}
