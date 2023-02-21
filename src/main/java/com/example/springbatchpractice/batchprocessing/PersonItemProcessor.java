package com.example.springbatchpractice.batchprocessing;

import com.example.springbatchpractice.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

  @Override
  public Person process(final Person person) throws Exception {
    final String firstName = person.getFirstName().toUpperCase();
    final String lastName = person.getLastName().toLowerCase();

    final Person parsedPersonName = Person.builder().firstName(firstName).lastName(lastName).build();

    log.info("Converting (" + person + ") into (" + parsedPersonName + ")");

    return parsedPersonName;
  }
}
