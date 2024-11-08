/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testclass;

/**
 *
 * @author My University
 */
public class project {
 
    private String ProjectName;
    private int currentProgress;

    public project(String ProjectName, int currentProgress) {
        this.ProjectName = ProjectName;
        this.currentProgress = currentProgress;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public int getCurrentProgress() {
        return currentProgress;
    }

    public void setCurrentProgress(int currentProgress) {
        this.currentProgress = currentProgress;
    }
    
    

}
