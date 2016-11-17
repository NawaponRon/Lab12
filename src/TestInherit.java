interface StudentManager {
	abstract void show();

	abstract void grade();
}

class Student {
	String id, name, surname, grade;
	double score, midterm, fscore;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public double getMidterm() {
		return midterm;
	}

	public void setMidterm(double midterm) {
		this.midterm = midterm;
	}

	public double getFscore() {
		return fscore;
	}

	public void setFscore(double fscore) {
		this.fscore = fscore;
	}

	public String getGrade() {
		double Total;
		String G = null;
		Total = getScore() + getMidterm() + getFscore();
		if (Total > 80) {
			G = "A";
		}
		else if (Total > 70) {
			G = "B";
		}
		else if (Total > 60) {
			G = "C";
		}
		else if (Total > 50) {
			G = "D";
		}
		else {
			G = "E";
		}
      return G;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}

public class TestInherit extends Student implements StudentManager {

	public static void main(String[] args) {
		TestInherit data = new TestInherit();
		data.setId("584277004");
		data.setName("Nawaphon");
		data.setSurname("Ronnarongrit");
		data.setScore(25);
		data.setMidterm(25);
		data.setFscore(25);
		data.show();
		data.grade();

	}

	@Override
	public void show() {
		System.out.println("Studen ID :" + getId());
		System.out.println("Name   : " + getName());
		System.out.println("Suname : " + getSurname());
		System.out.printf("\t>>Your scores<<\n");
		System.out.println("Score   : " + getScore());
		System.out.println("Midterm : " + getMidterm());
		System.out.println("Final   : " + getFscore());

	}

	@Override
	public void grade() {

		System.out.println("Your grade : " + getGrade());

	}

}