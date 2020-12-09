package pe.finan.server.app.repository.common;

import java.util.List;

public interface IReadable<T> {
    public List<T> get(int id);
    public List<T> getAll();
    public List<T> getAll(T object);

}