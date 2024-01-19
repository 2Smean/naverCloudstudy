package person.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class PersonDao {
	private PersonRepository personRepository;
	
	//추가 
	public void insertPerson(PersonDto dto)
	{
		personRepository.save(dto);
	}
	
	//전체 출력 
	public List<PersonDto> getAllPersons()
	{
		return personRepository.findAll();
	}

	//삭제 
	public void deletePerson(int pnum)
	{
		personRepository.deleteById(pnum);
	}
	
	public PersonDto getSelectData(int pnum)
	{
		return personRepository.getReferenceById(pnum);
	}
	
	public void updatePerson(PersonDto dto)
	{
		//dto 에 pnum 이 포함되어있어야 수정이 됨
		//없을 경우 추가가됨 
		//왜냐하면 save 의 기능은 두가지가 있는데
		//저장,업데이트 를 구분해주기 위해서 pnum 을 사용한다
		personRepository.save(dto);
	}
}
