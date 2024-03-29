package context

import org.apache.pekko.actor.ActorSystem

import javax.inject.{Inject, Singleton}
import play.api.libs.concurrent.CustomExecutionContext

/**
 * @author steve
 */
@Singleton
class DatabaseExecutionContext @Inject()(system: ActorSystem) extends CustomExecutionContext(system, "database.dispatcher")