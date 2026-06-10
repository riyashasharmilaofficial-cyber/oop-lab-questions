import java.sql.*;

public class TaskDAO {

    public boolean addTask(Task task) {

        String sql =
        "INSERT INTO tasks(task_id,task_title,status) VALUES(?,?,?)";

        try(Connection con =
                DatabaseConnection.getConnection();
            PreparedStatement pst =
                con.prepareStatement(sql)) {

            pst.setInt(1, task.getTaskId());
            pst.setString(2, task.getTaskTitle());
            pst.setString(3, task.getStatus());

            return pst.executeUpdate() > 0;

        } catch(SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public Task searchTask(int taskId) {

        String sql =
        "SELECT * FROM tasks WHERE task_id=?";

        try(Connection con =
                DatabaseConnection.getConnection();
            PreparedStatement pst =
                con.prepareStatement(sql)) {

            pst.setInt(1, taskId);

            ResultSet rs = pst.executeQuery();

            if(rs.next()) {

                return new Task(
                        rs.getInt("task_id"),
                        rs.getString("task_title"),
                        rs.getString("status")
                );
            }

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public boolean updateTask(Task task) {

        String sql =
        "UPDATE tasks SET task_title=?, status=? WHERE task_id=?";

        try(Connection con =
                DatabaseConnection.getConnection();
            PreparedStatement pst =
                con.prepareStatement(sql)) {

            pst.setString(1, task.getTaskTitle());
            pst.setString(2, task.getStatus());
            pst.setInt(3, task.getTaskId());

            return pst.executeUpdate() > 0;

        } catch(SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean deleteTask(int taskId) {

        String sql =
        "DELETE FROM tasks WHERE task_id=?";

        try(Connection con =
                DatabaseConnection.getConnection();
            PreparedStatement pst =
                con.prepareStatement(sql)) {

            pst.setInt(1, taskId);

            return pst.executeUpdate() > 0;

        } catch(SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
