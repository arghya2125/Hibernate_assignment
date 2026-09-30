package org.arghya.hibernate_assign_1.entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "project_id")
	private int projectId;

	@Column(name = "project_name", length = 50, nullable = false)
	private String projectName;

	@Column(name = "project_start_date")
	private Date projectStartDate;

	@Column(name = "project_end_date")
	private Date projectEndDate;

	public Project() {
		super();
		this.projectId = 0;
		this.projectName = null;
		this.projectStartDate = null;
		this.projectEndDate = null;
	}

	public Project(String projectName, Date projectStartDate, Date projectEndDate) {
		super();
		this.projectName = projectName;
		this.projectStartDate = projectStartDate;
		this.projectEndDate = projectEndDate;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public Date getProjectEndDate() {
		return projectEndDate;
	}

	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId
				+ ", projectName=" + projectName
				+ ", projectStartDate=" + projectStartDate
				+ ", projectEndDate=" + projectEndDate + "]";
	}
}
