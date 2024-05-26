package org.sopt.sopkathonweb1.repository;

import org.sopt.sopkathonweb1.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {
    @Query("SELECT r FROM Room r WHERE r.id = :roomId AND r.code = :code")
    Optional<Room> findRoomByIdAndCode(@Param("roomId") Long roomId, @Param("code") int code);

    @Query("SELECT COUNT(m) FROM Member m WHERE m.room.id = :roomId")
    int countMembersByRoomId(@Param("roomId") Long roomId);
}

