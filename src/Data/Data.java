package Data;

import Entities.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Data {
    
    public User foundUser(String name) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            archivo = new File("src/Data/users.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea = "";
            String[] user;
            
            while ((linea = br.readLine()) != null) {
                user = linea.split(",");
                if (user[0].equals(name)) {
                    User u = new User(user[0], Integer.parseInt(user[1]), Integer.parseInt(user[2]));
                    return u;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
        return null;
    }
    
    public void writeUser(User user) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("src/Data/users.txt", true);
            pw = new PrintWriter(fichero);
            
            pw.println(user + "," + user.getScore() + "," + user.getWins());
            System.out.println("Ingresó un nuevo dato.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void updateUser(User uUpdate) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            archivo = new File("src/Data/users.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea = "";
            String[] user;
            String content = "";
            while ((linea = br.readLine()) != null) {
                user = linea.split(",");
                if (user[0].equals(uUpdate.getName())) {
                    content += uUpdate.getName() + "," + uUpdate.getScore() + "," + uUpdate.getWins() + "\n";
                } else {
                    content += linea + "\n";
                }
            }
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
    }
    
    public int getNumberMatch() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            archivo = new File("src/Data/match.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            return Integer.parseInt(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
    }
    
    public void writeMatch(int numberMatch, String name, int piecesUsed,String time) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("src/Data/match.txt", true);
            pw = new PrintWriter(fichero);
            pw.println(numberMatch + "," + name + "," + piecesUsed+","+time);
            updateNumberMatch();
            System.out.println("Ingresó un nuevo dato.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    private void updateNumberMatch() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            archivo = new File("src/Data/match.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea = br.readLine();
            String content = (Integer.parseInt(linea) + 1) + "\n";
            while ((linea = br.readLine()) != null) {
                content += linea + "\n";
            }
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
    }
    
    public ArrayList<User> getUsers() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<User> list = new ArrayList<>();
        try {
            archivo = new File("src/Data/users.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea = "";
            String[] user;
            
            while ((linea = br.readLine()) != null) {
                user = linea.split(",");
                list.add(new User(user[0], Integer.parseInt(user[1]), Integer.parseInt(user[2])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
        return list;
    }
    
    public ArrayList<String> getMatchs() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<String> list = new ArrayList<>();
        try {
            archivo = new File("src/Data/match.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea = "";
            br.readLine();
            while ((linea = br.readLine()) != null) {
                list.add(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
        return list;
    }
}
