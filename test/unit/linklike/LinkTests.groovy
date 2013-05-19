package linklike



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Link)
class LinkTests {

    void testCanCreateNewLink() {
		def link = new Link(title: 'Google', link:'www.google.com')
		assert link != null
	}

	void testIncreaseVotes(){
		def link = new Link(title: 'MSN', link:'www.msn.com')
		assertEquals 0, link.votes
		link.increaseVotes()
		assertEquals 1, link.votes
	}
}
