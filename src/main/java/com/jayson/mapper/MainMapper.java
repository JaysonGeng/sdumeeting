package  com.jayson.mapper;

import com.jayson.entity.Event;
import com.jayson.entity.EventType;
import com.jayson.entity.Room;
import com.jayson.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MainMapper {
  @Select({"select * from Events "})
  List<Event> getAllEvents();
  
  @Select({"select * from Rooms "})
  List<Room> getAllRooms();
  
  @Select({"select * from Rooms where id = #{id}"})
  Room getRoomById(@Param("id") int paramInt);
  
  @Select({"select * from Users where id = #{id}"})
  User getUserById(@Param("id") int paramInt);
  
  @Select({"select * from RventTypes where id = #{id}"})
  EventType getEventTypeById(@Param("id") int paramInt);

  @Update("UPDATE Users SET role_id = #{roleId} WHERE id = #{id}")
  int userEdit(@Param("id")int id ,@Param("roleId") int roleId);
}


/* Location:              C:\Users\MichaelOD_WIN10\Desktop\fsdownload\sdu-meeting-0.0.9-SNAPSHOT.jar!\BOOT-INF\classes\com\jayson\mapper\MainMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */