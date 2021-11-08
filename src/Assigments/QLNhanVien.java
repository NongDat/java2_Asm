/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments;

import Assigment_Xfile.XFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nongvandat
 */
public class QLNhanVien implements QLNhanVienInterface<NhanVien> {

   private List<NhanVien> list;
    public QLNhanVien(){
        this.list = new ArrayList<>();
    }

    @Override
    public int save(NhanVien n) {
        int viTri = findByID(n.getMaNV());
        if(viTri < 0){
            this.list.add(n);
        }else{
            this.list.set(viTri, n);
        }
        return 1;
    }

    @Override
    public int delete(String id) {
        int viTri = findByID(id);
        if(viTri >= 0){
            this.list.remove(viTri);
        }
        return viTri;
    }

    @Override
     public int findByID(String id) {
        int viTri = -1;
        for(int i = 0; i < this.list.size();i++){
            if(this.list.get(i).getMaNV().equalsIgnoreCase(id)){
                viTri = i;
                break;
            }
        }
        return viTri;
    }

    @Override
    public List<NhanVien> open(String path) {
        this.list.clear();
        this.list = (List<NhanVien>) XFile.readObject(path);
        return this.list;
    }
   @Override
    public void saveFile(String path,Object object){
        XFile.writeObject(path, list);
    }
     @Override
    public int count() {
        return this.list.size();
    }

    @Override
    public void setList(List<NhanVien> list) {
        this.list = list;
    }

    @Override
    public List<NhanVien> getList() {
        return this.list;
    }

   


    
}
