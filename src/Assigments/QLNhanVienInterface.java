/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments;

import java.util.List;

/**
 *
 * @author nongvandat
 */
public interface QLNhanVienInterface<E> {
    public int save(E n);
    public int delete(String id);
    public int findByID(String id);
    public List<E> open(String path);
    public void saveFile(String path,Object object);
    public int count();
    
    public void  setList(List<E> list);
    public List<E> getList();
}
