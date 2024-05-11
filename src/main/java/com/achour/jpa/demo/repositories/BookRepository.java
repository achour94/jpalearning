package com.achour.jpa.demo.repositories;

import com.achour.jpa.demo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jt on 6/12/21.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
