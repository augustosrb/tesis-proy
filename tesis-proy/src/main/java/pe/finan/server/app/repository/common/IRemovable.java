package pe.finan.server.app.repository.common;

public interface IRemovable<T> {
    void removebyId(int id);
    void remove(T object);
}