package henu.yan.sample.repository;

import henu.yan.sample.model.Animation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface AnimationRepository extends PagingAndSortingRepository<Animation, Integer> {

}
