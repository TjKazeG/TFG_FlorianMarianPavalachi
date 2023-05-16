package es.tjkazeshop.app.security;

public class PasswordEncoder {
	public String encode(String password) {
		return String.valueOf(password.hashCode());
	}

	public boolean matches(String contrasenha, String contrasenha2) {
		return encode(contrasenha).equalsIgnoreCase(contrasenha2);
	}
}
