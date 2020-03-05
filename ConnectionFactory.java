public abstract class ConnectionFactory
{
    protected abstract Connection createConnection(String type);
}