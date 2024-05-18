package org.sopt.sopkathonweb1.repository;

import org.sopt.sopkathonweb1.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {

}

