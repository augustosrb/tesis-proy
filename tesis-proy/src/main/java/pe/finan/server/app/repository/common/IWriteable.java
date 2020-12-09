package pe.finan.server.app.repository.common;

public interface IWriteable<T> {
	public int update(T object);
	public int create(T object);
}