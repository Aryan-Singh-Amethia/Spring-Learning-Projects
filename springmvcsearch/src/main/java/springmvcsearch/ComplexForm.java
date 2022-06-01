package springmvcsearch;

import java.util.List;

public class ComplexForm {
  private String email;
  private String language;
  private List<Integer> level;
  private String text;
  private String time;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public List<Integer> getLevel() {
	return level;
}
public void setLevel(List<Integer> level) {
	this.level = level;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
@Override
public String toString() {
	return "ComplexForm [email=" + email + ", language=" + language + ", level=" + level + ", text=" + text + ", time="
			+ time + "]";
}
  
}
